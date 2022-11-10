package com.nationalfarmers.farmers.controller;

import com.nationalfarmers.farmers.request.FarmerAdditionRequest;
import com.nationalfarmers.farmers.service.FarmerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/farmer")
@Slf4j
public record FarmerController(FarmerService farmerService) {

    @PostMapping
    public void addFarmer(@RequestBody FarmerAdditionRequest farmerAdditionRequest){
        farmerService.addFarmer(farmerAdditionRequest);
    }
}
