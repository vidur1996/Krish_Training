package com.vidur.rentcloud.profile.service.service;

import com.vidur.rentcloud.model.Customer;
import com.vidur.rentcloud.profile.service.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceimpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer save(Customer customer) {

        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> getAll() {
        List<Customer> customers = customerRepository.findAll();

        return  customers;
    }

    @Override
    public Customer fetchCustomerById(int id) {
        Optional<Customer> customer = customerRepository.findById(id);
        if(customer.isPresent()){
            return customer.get();
        }
        return  null;
    }
}
