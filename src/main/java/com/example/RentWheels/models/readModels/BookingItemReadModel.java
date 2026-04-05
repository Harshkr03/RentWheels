package com.example.RentWheels.models.readModels;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookingItemReadModel {

    private Long vehicleId;

    private String brand;

    private String model;

    private LocalDate startDate;

    private LocalDate endDate;
}
