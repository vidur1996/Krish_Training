package com.vidu.rentcloud.customerservice.service;

import com.vidu.rentcloud.model.customer.Customer;

import java.util.List;

public interface CustomerService {

    Customer save(Customer customer);

    Customer findById(int id);

    List<Customer> findAll();
}
