package com.example.Vehicle.vehicle.Entity;

import jakarta.persistence.*;
import org.springframework.context.annotation.EnableMBeanExport;

@Entity
@Table(name = "bikes")
public class BikeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "RegisterNo")
    private Long registerNo;
    @Column(name = "ModelName")
    private String modelName;
    @Column(name = "OwnerName")
    private String ownerName;
    @Column(name = "Address")
    private String address;
    @Column(name = "Email")
    private String email;
    @Column(name = "PhoneNo")
    private Long phoneNo;
    @Column(name = "YearOfBuy")
    private String yearOfBuy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRegisterNo() {
        return registerNo;
    }

    public void setRegisterNo(Long registerNo) {
        this.registerNo = registerNo;
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
