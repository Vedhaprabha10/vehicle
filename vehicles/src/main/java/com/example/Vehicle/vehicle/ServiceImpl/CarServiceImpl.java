package com.example.Vehicle.vehicle.ServiceImpl;

import com.example.Vehicle.vehicle.Dto.CarDTO;
import com.example.Vehicle.vehicle.Entity.CarEntity;
import com.example.Vehicle.vehicle.Repository.CarRepository;
import com.example.Vehicle.vehicle.Service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    @Autowired
    CarRepository carRepository;
    @Override
    public CarEntity saveDetails(CarDTO carDTO) {
        CarEntity carEnity1 = new CarEntity();
        carEnity1.setRegisterno(carDTO.getRegisterno());
        carEnity1.setModel(carDTO.getModel());
        carEnity1.setOwnername(carDTO.getOwnername());
        carEnity1.setAddress(carDTO.getAddress());
        carEnity1.setEmail(carDTO.getEmail());
        carEnity1.setPhoneno(carDTO.getPhoneno());
        carEnity1.setYearofbuy(carDTO.getYearofbuy());

        return carRepository.save(carEnity1);
    }

    @Override
    public List<CarEntity> getAllCar() {
        return carRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        carRepository.deleteById(id);
    }
}
