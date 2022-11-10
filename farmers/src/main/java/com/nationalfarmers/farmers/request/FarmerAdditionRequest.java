package com.nationalfarmers.farmers.request;

public record FarmerAdditionRequest(
        String firstName,
        String lastName,
        String fullAddress,
        String email,
        Long phoneNo) {

}
