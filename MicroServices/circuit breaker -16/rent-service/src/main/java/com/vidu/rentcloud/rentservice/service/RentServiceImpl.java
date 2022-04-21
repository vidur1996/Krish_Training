package com.vidu.rentcloud.rentservice.service;

import com.vidu.rentcloud.model.customer.Customer;
import com.vidu.rentcloud.model.rent.Rent;
import com.vidu.rentcloud.model.vehicle.Vehicle;
import com.vidu.rentcloud.rentservice.hystrix.CommonHystrixCommand;
import com.vidu.rentcloud.rentservice.hystrix.VehicleCommand;
import com.vidu.rentcloud.rentservice.model.DetailResponse;
import com.vidu.rentcloud.rentservice.repository.RentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@Service
public class RentServiceImpl implements RentService {

    @Autowired
    RentRepository rentRepository;
    @Autowired
    RestTemplate restTemplate;



    @LoadBalanced
    @Bean
    RestTemplate getRestTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Override
    public Rent save(Rent customer) {
        return rentRepository.save(customer);
    }

    @Override
    public Rent findById(int id) {
        Optional<Rent> rent = rentRepository.findById(id);

        if (rent.isPresent())
            return rent.get();
        else
            return new Rent();
    }

    @Override
    public List<Rent> findAll() {
        return rentRepository.findAll();
    }

    @Override
    public DetailResponse findDetailResponse(int id) throws ExecutionException, InterruptedException {
        Rent rent = findById(id);
        Customer customer = getCustomer(rent.getCustomerId());
        Vehicle vehicle = getVehicle(rent.getVehicleId());
        return new DetailResponse(rent, customer, vehicle);

    }

    private Customer getCustomer(int customerId) throws ExecutionException, InterruptedException {

        CommonHystrixCommand<Customer> customerCommonHysctrixCommand=new CommonHystrixCommand<Customer>("default",()->
        {
            return restTemplate.getForObject("http://customer/services/customers/"+customerId,Customer.class);
        },()->{
            return new Customer();
        });

        Future<Customer> customerFuture=customerCommonHysctrixCommand.queue();
        return customerFuture.get();

        //Customer customer = restTemplate.getForObject("http://customer/services/customers/" + customerId, Customer.class);
        //return customer;

    }

    private Vehicle getVehicle(int vehicleId) {
        VehicleCommand vehicleCommand = new VehicleCommand(restTemplate,vehicleId);
        return vehicleCommand.execute();
//        return restTemplate.getForObject("http://vehicle/services/vehicles/" + vehicleId, Vehicle.class);
    }
}
