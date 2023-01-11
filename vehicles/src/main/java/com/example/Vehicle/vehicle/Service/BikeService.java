package com.example.Vehicle.vehicle.Service;

import com.example.Vehicle.vehicle.Dto.BikeDTO;
import com.example.Vehicle.vehicle.Entity.BikeEntity;

import java.util.List;

public interface BikeService {
     BikeEntity saveBike(BikeDTO bikeDTO);

     List<BikeEntity> getAllBikes();

    void deleteById(Long id);

//    BikeEntity updates(BikeDTO bikeDTO);

}
