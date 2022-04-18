package com.vidur.rentcloud.profile.service.repository;

import com.vidur.rentcloud.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle,Integer> {
}
