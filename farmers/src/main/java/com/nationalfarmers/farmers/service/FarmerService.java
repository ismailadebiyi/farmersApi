package com.nationalfarmers.farmers.service;

import com.nationalfarmers.farmers.model.Farmer;
import com.nationalfarmers.farmers.repo.FarmerRepo;
import com.nationalfarmers.farmers.request.FarmerAdditionRequest;
import org.springframework.stereotype.Service;

@Service
public record FarmerService(FarmerRepo farmerRepo) {

    public void addFarmer(FarmerAdditionRequest request){
        /*
         * TODO:
         *  1. Check if farmer already has an account
         *  2. Check if the Email is valid.
         *  3.
         */
        Farmer farmer = Farmer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .fullAddress(request.fullAddress())
                .email(request.email())
                .phoneNo(request.phoneNo())
                .build();
        farmerRepo.save(farmer);
    }
}
