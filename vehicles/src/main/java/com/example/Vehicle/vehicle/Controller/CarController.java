package com.example.Vehicle.vehicle.Controller;

import com.example.Vehicle.vehicle.Dto.CarDTO;
import com.example.Vehicle.vehicle.Entity.CarEntity;
import com.example.Vehicle.vehicle.Service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cars")
public class CarController {
    @Autowired
    CarService carService;
    
    @PostMapping("/details")
    public ResponseEntity<?> registerCars (@RequestBody CarDTO carDTO){
        System.out.println("application is hitting");
       CarEntity car = carService.saveDetails(carDTO);
       return ResponseEntity.status(HttpStatus.CREATED).body(car);
    }
}
