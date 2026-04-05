package com.example.RentWheels.models.readModels;

import java.util.List;

import com.example.RentWheels.models.Bookings.Status;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookingReadModel {

    private Long id;

    private Long userId;

    private Status status;

    private Double totalPrice;

    private List<BookingItemReadModel> bookingItems;
}
