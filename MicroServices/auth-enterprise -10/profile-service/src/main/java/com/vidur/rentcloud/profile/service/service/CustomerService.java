package com.vidur.rentcloud.profile.service.service;

import com.vidur.rentcloud.model.Customer;

import java.util.List;

public interface CustomerService {

    Customer save(Customer customer);

    List<Customer> getAll();

    Customer fetchCustomerById(int id);
}
