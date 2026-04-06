package com.example.RentWheels.models.readModels;

import java.util.List;

import com.example.RentWheels.models.Vehicle.Type;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VehicleReadModel {

    private Long id;

    private Long ownerId;

    private String brand;

    private String model;

    private Type type;

    private Double pricePerDay;

    private List<AvailabilityReadModel> availabilities;
}
