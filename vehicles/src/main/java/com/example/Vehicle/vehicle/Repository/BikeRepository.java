package com.example.Vehicle.vehicle.Repository;

import com.example.Vehicle.vehicle.Entity.BikeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BikeRepository extends JpaRepository<BikeEntity , Long> { }
