package com.example.Vehicle.vehicle.Controller;

import com.example.Vehicle.vehicle.Dto.BikeDTO;
import com.example.Vehicle.vehicle.Entity.BikeEntity;
import com.example.Vehicle.vehicle.Repository.BikeRepository;
import com.example.Vehicle.vehicle.Service.BikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/bikes")
public class BikeController {
    @Autowired
    BikeService bikeService;
    @Autowired
    private BikeRepository bikeRepository;

    @PostMapping("/details")
    public ResponseEntity<?> registerBikes(@RequestBody BikeDTO bikeDTO){
        BikeEntity bobj =bikeService.saveBike(bikeDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(bobj);
    }
    @GetMapping("/bikeDetails")
    public ResponseEntity<List<BikeEntity>> getAllDetails(){
        List<BikeEntity> list = bikeService.getAllBikes();
        return  new ResponseEntity<List<BikeEntity>>(list,HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteDetails (@PathVariable("id") Long id){
    bikeService.deleteById(id);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateData(@PathVariable("id") Long id,@RequestBody BikeDTO bikeDTO){
       BikeEntity updateData = this.bikeService.updates(bikeDTO);
       return ResponseEntity.status(HttpStatus.OK).body(updateData);
    }
}
