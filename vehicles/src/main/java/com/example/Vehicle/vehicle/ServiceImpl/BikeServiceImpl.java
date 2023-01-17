package com.example.Vehicle.vehicle.ServiceImpl;

import com.example.Vehicle.vehicle.Dto.BikeDTO;
import com.example.Vehicle.vehicle.Entity.BikeEntity;
import com.example.Vehicle.vehicle.Repository.BikeRepository;
import com.example.Vehicle.vehicle.Service.BikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class BikeServiceImpl implements BikeService {
    @Autowired
    BikeRepository repository;

    @Override
    public BikeEntity saveBike(BikeDTO bikeDTO) {
        BikeEntity bikeEntity1 = new BikeEntity();
        bikeEntity1.setRegisterNo(bikeDTO.getRegisterNo());
        bikeEntity1.setModelName(bikeDTO.getModelName());
        bikeEntity1.setOwnerName(bikeDTO.getOwnerName());
        bikeEntity1.setAddress(bikeDTO.getAddress());
        bikeEntity1.setEmail(bikeDTO.getEmail());
        bikeEntity1.setPhoneNo(bikeDTO.getPhoneNo());
        bikeEntity1.setYearOfBuy(bikeDTO.getYearOfBuy());
        return repository.save(bikeEntity1);
    }

    @Override
    public List<BikeEntity> getAllBikes() {
        return repository.findAll();
    }

    @Override
    public void deleteById(Long id) {
    repository.deleteById(id);
    }

    @Override
    public BikeEntity updates(BikeDTO bikeDTO) {
        BikeEntity updateData = new BikeEntity();
        updateData.setRegisterNo(bikeDTO.getRegisterNo());
        updateData.setModelName(bikeDTO.getModelName());
        updateData.setOwnerName(bikeDTO.getOwnerName());
        updateData.setAddress(bikeDTO.getAddress());
        updateData.setEmail(bikeDTO.getEmail());
        updateData.setPhoneNo(bikeDTO.getPhoneNo());
        updateData.setYearOfBuy(bikeDTO.getYearOfBuy());
       return repository.save(updateData);
    }
}
