package com.vidur.rentcloud.profile.service.controller;


import com.vidur.rentcloud.model.Customer;
import com.vidur.rentcloud.profile.service.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/services")
public class ProfileController {

    @Autowired
    CustomerService customerService;

    @RequestMapping(value = "/profile" ,method = RequestMethod.POST)
    public Customer save(@RequestBody Customer customer){
        return customerService.save(customer);
    }

    @RequestMapping(value = "/customers" ,method = RequestMethod.GET)
    public List<Customer> getAll(){
        return  customerService.getAll();
    }

    @RequestMapping(value = "/customer",method = RequestMethod.GET)
    public ResponseEntity<Customer> fetchcustomer(@RequestParam int id){
        Customer customer= customerService.fetchCustomerById(id);

        if(customer==null){
            return ResponseEntity.notFound().build();
        }
        else {
            return ResponseEntity.ok().body(customer);
        }

    }
}
