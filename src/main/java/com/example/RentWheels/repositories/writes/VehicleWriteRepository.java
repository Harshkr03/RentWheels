package com.example.RentWheels.repositories.writes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.RentWheels.models.Vehicle;

@Repository
public interface VehicleWriteRepository extends JpaRepository<Vehicle, Long> {
}
