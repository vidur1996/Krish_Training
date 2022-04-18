package com.vidu.rentcloud.rentservice.service;

import com.vidu.rentcloud.model.rent.Rent;
import com.vidu.rentcloud.rentservice.model.DetailResponse;

import java.util.List;

public interface RentService {
    Rent save(Rent customer);

    Rent findById(int id);

    List<Rent> findAll();

    DetailResponse findDetailResponse(int id);
}
