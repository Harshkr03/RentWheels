package com.example.RentWheels.repositories.writes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.RentWheels.models.VehicleImages;

@Repository
public interface VehicleImagesWriteRepository extends JpaRepository<VehicleImages, Long> {
}
