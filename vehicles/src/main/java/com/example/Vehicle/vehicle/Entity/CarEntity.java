package com.example.Vehicle.vehicle.Entity;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name = "cardetails")
public class CarEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "Registerno")
    private String Registerno;
    @Column(name = "Model")
    private String Model;
    @Column(name = "Ownername")
    private String Ownername;
    @Column(name = "Address")
    private String Address;
    @Column(name = "Email")
    private String Email;
    @Column(name = "Phoneno")
    private Long Phoneno;
    @Column(name = "Yearofbuy")
    private String Yearofbuy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRegisterno() {
        return Registerno;
    }

    public void setRegisterno(String registerno) {
        this.Registerno = registerno;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        this.Model = model;
    }

    public String getOwnername() {
        return Ownername;
    }

    public void setOwnername(String ownername) {
        this.Ownername = ownername;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        this.Address = address;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public Long getPhoneno() {
        return Phoneno;
    }

    public void setPhoneno(Long phoneno) {
        this.Phoneno = phoneno;
    }

    public String getYearofbuy() {
        return Yearofbuy;
    }

    public void setYearofbuy(String yearofbuy) {
        this.Yearofbuy = yearofbuy;
    }
}
