package com.example.Vehicle.vehicle.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Car-details")
public class CarEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "RegisterNo")
    private String registerno;
    @Column(name = "Model")
    private String model;
    @Column(name = "OwnerName")
    private String ownername;
    @Column(name = "Address")
    private String address;
    @Column(name = "Email")
    private String email;
    @Column(name = "PhoneNo")
    private Long phoneno;
    @Column(name = "YearOfBuy")
    private String yearofbuy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRegisterno() {
        return registerno;
    }

    public void setRegisterno(String registerno) {
        this.registerno = registerno;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOwnername() {
        return ownername;
    }

    public void setOwnername(String ownername) {
        this.ownername = ownername;
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

    public Long getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(Long phoneno) {
        this.phoneno = phoneno;
    }

    public String getYearofbuy() {
        return yearofbuy;
    }

    public void setYearofbuy(String yearofbuy) {
        this.yearofbuy = yearofbuy;
    }
}
