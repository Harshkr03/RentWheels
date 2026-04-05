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
public class AvailabilityReadModel {
    
    private Long id;

    private Long vehicleId;

    private LocalDate date;

    private Long bookingId;

    private Boolean isAvailable;
}
