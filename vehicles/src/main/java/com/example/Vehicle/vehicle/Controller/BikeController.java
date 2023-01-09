package com.example.Vehicle.vehicle.Controller;

import com.example.Vehicle.vehicle.Dto.BikeDTO;
import com.example.Vehicle.vehicle.Entity.BikeEntity;

import com.example.Vehicle.vehicle.Service.BikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bikes")
public class BikeController {
    @Autowired
    BikeService bikeService;
    @PostMapping("/details")
    public ResponseEntity<?> registerBikes(@RequestBody BikeDTO bikeDTO){
        System.out.println("save details running");
        BikeEntity bobj =bikeService.getBike(bikeDTO);

        return ResponseEntity.status(HttpStatus.CREATED).body(bobj);
    }
}
