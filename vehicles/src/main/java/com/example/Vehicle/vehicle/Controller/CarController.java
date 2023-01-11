package com.example.Vehicle.vehicle.Controller;

import com.example.Vehicle.vehicle.Dto.CarDTO;
import com.example.Vehicle.vehicle.Entity.BikeEntity;
import com.example.Vehicle.vehicle.Entity.CarEntity;
import com.example.Vehicle.vehicle.Service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {
    @Autowired
    CarService carService;
    
    @PostMapping("/details")
    public ResponseEntity<CarEntity> registerCars (@RequestBody CarDTO carDTO){
       CarEntity car = carService.saveDetails(carDTO);
       return ResponseEntity.status(HttpStatus.CREATED).body(car);
    }
    @GetMapping("/cardetails")
    public ResponseEntity<List<CarEntity>> getAllDetails(){
    List<CarEntity> list = carService.getAllCar();
    return new ResponseEntity<List<CarEntity>>(list,HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public void deletedetails(@PathVariable("id") Long id){
        carService.deleteById(id);
    }

}
