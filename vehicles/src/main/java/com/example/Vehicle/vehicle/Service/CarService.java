package com.example.Vehicle.vehicle.Service;

import com.example.Vehicle.vehicle.Dto.CarDTO;
import com.example.Vehicle.vehicle.Entity.CarEntity;

import java.util.List;

public interface CarService {

   public CarEntity  saveDetails(CarDTO carDTO);

   List<CarEntity> getAllCar();

   void deleteById(Long id);
}
