package com.vidu.rentcloud.rentservice.repository;

import com.vidu.rentcloud.model.rent.Rent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentRepository extends JpaRepository<Rent, Integer> {
}
