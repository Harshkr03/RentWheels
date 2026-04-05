package com.example.RentWheels.repositories.reads;

import java.util.List;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.example.RentWheels.models.readModels.AvailabilityReadModel;
import com.example.RentWheels.models.readModels.BookingReadModel;
import com.example.RentWheels.models.readModels.VehicleReadModel;

import lombok.RequiredArgsConstructor;
import tools.jackson.core.JacksonException;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

@Repository
@RequiredArgsConstructor
public class RedisReadRepository {

    public static final String VEHICLE_KEY_PREFIX       = "vehicle:";
    public static final String AVAILABILITY_KEY_PREFIX  = "availability:vehicle:";
    public static final String BOOKING_KEY_PREFIX       = "booking:";
    public static final String USER_BOOKINGS_KEY_PREFIX = "booking:user:";

    private final RedisTemplate<String, String> redisTemplate;
    private final ObjectMapper objectMapper;

    public VehicleReadModel findVehicleById(Long id) {
        String key = VEHICLE_KEY_PREFIX + id;
        String value = redisTemplate.opsForValue().get(key);

        if (value == null) {
            return null;
        }

        try {
            return objectMapper.readValue(value, VehicleReadModel.class);
        } catch (JacksonException e) {
            throw new RuntimeException("Failed to parse VehicleReadModel from Redis", e);
        }
    }

    public List<AvailabilityReadModel> findAvailabilityByVehicleId(Long vehicleId) {
        String key = AVAILABILITY_KEY_PREFIX + vehicleId;
        String value = redisTemplate.opsForValue().get(key);

        if (value == null) {
            return null;
        }

        try {
            return objectMapper.readValue(value, new TypeReference<List<AvailabilityReadModel>>() {});
        } catch (JacksonException e) {
            throw new RuntimeException("Failed to parse AvailabilityReadModel list from Redis", e);
        }
    }

    public BookingReadModel findBookingById(Long id) {
        String key = BOOKING_KEY_PREFIX + id;
        String value = redisTemplate.opsForValue().get(key);

        if (value == null) {
            return null;
        }

        try {
            return objectMapper.readValue(value, BookingReadModel.class);
        } catch (JacksonException e) {
            throw new RuntimeException("Failed to parse BookingReadModel from Redis", e);
        }
    }

    public List<BookingReadModel> findBookingsByUserId(Long userId) {
        String key = USER_BOOKINGS_KEY_PREFIX + userId;
        String value = redisTemplate.opsForValue().get(key);

        if (value == null) {
            return null;
        }

        try {
            return objectMapper.readValue(value, new TypeReference<List<BookingReadModel>>() {});
        } catch (JacksonException e) {
            throw new RuntimeException("Failed to parse BookingReadModel list from Redis", e);
        }
    }
}
