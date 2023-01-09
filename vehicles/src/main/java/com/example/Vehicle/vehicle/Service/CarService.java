package com.example.Vehicle.vehicle.Service;

import com.example.Vehicle.vehicle.Dto.CarDTO;
import com.example.Vehicle.vehicle.Entity.CarEntity;

public interface CarService {

   public CarEntity  saveDetails(CarDTO carDTO);
}
