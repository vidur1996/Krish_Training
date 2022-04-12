package com.vidur.rentcloud.profile.service.service;

import com.vidur.rentcloud.model.Vehicle;
import com.vidur.rentcloud.profile.service.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    VehicleRepository vehicleRepository;

    @Override
    public Vehicle save(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    @Override
    public List<Vehicle> getAll() {
        List<Vehicle> vehicles = vehicleRepository.findAll();

        return  vehicles;
    }

    @Override
    public Vehicle fetchVehicleById(int id) {
        Optional<Vehicle> vehicle = vehicleRepository.findById(id);
        if(vehicle.isPresent()){
            return vehicle.get();
        }
        return  null;
    }
}
