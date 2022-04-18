package com.vidur.rentcloud.profile.service.repository;

import com.vidur.rentcloud.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
