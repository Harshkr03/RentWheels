package com.example.RentWheels.models.readModels;

import java.util.List;

import com.example.RentWheels.models.Availability;
import com.example.RentWheels.models.BookingItem;
import com.example.RentWheels.models.VehicleImages;
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

    private String brand;

    private String model;

    private Type type;

    private Double price_per_day;

    private List<VehicleImages> vehicleImages;

    private List<Availability> availabilities;

    private List<BookingItem> bookingItems;

    public enum Type {
        SCOOTY, BIKE, CAR, SUV
    }
}
