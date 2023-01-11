package com.example.Vehicle.vehicle.Dto;

public class BikeDTO {
    private Long id;
    private Long registerNo;
    private String modelName;
    private String ownerName;
    private String address;
    private String email;
    private Long phoneNo;
    private String yearOfBuy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getRegisterNo() {
        return registerNo;
    }

    public void setRegisterNo(Long registerNo) {
        this.registerNo = registerNo;
    }

    public Long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(Long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getYearOfBuy() {
        return yearOfBuy;
    }

    public void setYearOfBuy(String yearOfBuy) {
        this.yearOfBuy = yearOfBuy;
    }

}
