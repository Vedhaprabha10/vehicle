package com.example.Vehicle.vehicle.ServiceImpl;

import com.example.Vehicle.vehicle.Dto.CarDTO;
import com.example.Vehicle.vehicle.Entity.CarEntity;
import com.example.Vehicle.vehicle.Repository.CarRepository;
import com.example.Vehicle.vehicle.Service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements CarService {
    @Autowired
    CarRepository carRepository;
    @Override
    public CarEntity saveDetails(CarDTO carDTO) {
        CarEntity carEnity1 = new  CarEntity();
        carEnity1.setRegisterno(carEnity1.getRegisterno());
        carEnity1.setModel(carEnity1.getModel());
        carEnity1.setOwnername(carEnity1.getOwnername());
        carEnity1.setAddress(carEnity1.getAddress());
        carEnity1.setEmail(carEnity1.getEmail());
        carEnity1.setPhoneno(carEnity1.getPhoneno());
        carEnity1.setYearofbuy(carEnity1.getYearofbuy());

        return carRepository.save(carEnity1);
    }
}
