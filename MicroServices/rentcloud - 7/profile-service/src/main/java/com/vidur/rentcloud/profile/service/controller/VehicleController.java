package com.vidur.rentcloud.profile.service.controller;

import com.vidur.rentcloud.model.Vehicle;
import com.vidur.rentcloud.profile.service.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/services")
public class VehicleController {

    @Autowired
    VehicleService vehicleService;

    @RequestMapping(value = "/vehicle" ,method = RequestMethod.POST)
    public Vehicle save(@RequestBody Vehicle vehicle){
        return vehicleService.save(vehicle);
    }

    @RequestMapping(value = "/vehicles" ,method = RequestMethod.GET)
    public List<Vehicle> getAll(){
        return  vehicleService.getAll();
    }

    @RequestMapping(value = "/vehicle",method = RequestMethod.GET)
    public ResponseEntity<Vehicle> fetchVehicle(@RequestParam int id){
        Vehicle vehicle = vehicleService.fetchVehicleById(id);

        if(vehicle==null){
            return ResponseEntity.notFound().build();
        }
        else {
            return ResponseEntity.ok().body(vehicle);
        }

    }

}
