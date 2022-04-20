package com.vidu.rentcloud.rentservice.controller;

import com.vidu.rentcloud.model.rent.Rent;
import com.vidu.rentcloud.rentservice.model.Response;
import com.vidu.rentcloud.rentservice.model.SimpleResponse;
import com.vidu.rentcloud.rentservice.service.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/services/rents")
public class RentController {

    @Autowired
    RentService rentService;

    @PostMapping
    public Rent save(@RequestBody Rent rent) {
        return rentService.save(rent);
    }

    @GetMapping(value = "/{id}")
    public Response getRent(@PathVariable int id, @RequestParam(required = false) String type) {

        if (type == null) {
            return new SimpleResponse(rentService.findById(id));
        } else {
            return rentService.findDetailResponse(id);
        }


    }

    @GetMapping
    public List<Rent> getAllRents() {
        return rentService.findAll();
    }
}
