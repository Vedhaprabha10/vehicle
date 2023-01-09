package com.example.Vehicle.vehicle.Dto;

public class CarDTO {
    private Long id;
    private String registerNo;
    private String model;
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

    public String getRegisterNo() {
        return registerNo;
    }

    public void setRegisterNo(String registerNo) {
        this.registerNo = registerNo;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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
