package com.example.RentWheels.models;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "vehicle")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "owner_id", nullable = false)
    private User user;

    @Column(nullable = false)
    private String brand;

    @Column(nullable = false)
    private String model;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Type type;

    @Column(nullable = false)
    private Double price_per_day;

    @JsonIgnore
    @OneToMany(mappedBy = "vehicle")
    @Builder.Default
    private List<VehicleImages> vehicleImages = new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "vehicle")
    @Builder.Default
    private List<Availability> availabilities = new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "vehicle")
    @Builder.Default
    private List<BookingItem> bookingItems = new ArrayList<>();

    public enum Type {
        SCOOTY, BIKE, CAR, SUV
    }
}
