package com.vidur.rentcloud.profile.service.service;

import com.vidur.rentcloud.model.Customer;

import java.util.List;

public interface CustomerService {

    Customer save(Customer customer);

    Customer fetchById(int profileId);

    List<Customer> fetchAllProfiles();
}
