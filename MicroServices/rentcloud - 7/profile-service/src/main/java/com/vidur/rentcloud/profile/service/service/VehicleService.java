package com.vidur.rentcloud.profile.service.service;

import com.vidur.rentcloud.model.Vehicle;

import java.util.List;

public interface VehicleService {

    Vehicle save(Vehicle vehicle);

    List<Vehicle> getAll();

    Vehicle fetchVehicleById(int id);
}
