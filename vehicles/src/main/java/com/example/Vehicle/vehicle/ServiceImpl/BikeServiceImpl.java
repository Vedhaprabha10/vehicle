package com.example.Vehicle.vehicle.ServiceImpl;

import com.example.Vehicle.vehicle.Dto.BikeDTO;
import com.example.Vehicle.vehicle.Entity.BikeEntity;
import com.example.Vehicle.vehicle.Repository.BikeRepository;
import com.example.Vehicle.vehicle.Service.BikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BikeServiceImpl implements BikeService {
    @Autowired
    BikeRepository repository;

    @Override
    public BikeEntity getBike(BikeDTO bikeDTO) {
        BikeEntity bikeEntity1 = new BikeEntity();
        // bikeEntity1.setRegisterNo(bikeDTO.getRegisterNo());
        bikeEntity1.setModelName(bikeDTO.getModelName());
        bikeEntity1.setOwnerName(bikeDTO.getOwnerName());
        bikeEntity1.setAddress(bikeDTO.getAddress());
        bikeEntity1.setEmail(bikeDTO.getEmail());
        bikeEntity1.setPhoneNo(bikeDTO.getPhoneNo());
        bikeEntity1.setYearOfBuy(bikeDTO.getYearOfBuy());

        return repository.save(bikeEntity1);
    }
}
