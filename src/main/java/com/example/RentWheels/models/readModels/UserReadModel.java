package com.example.RentWheels.models.readModels;

import com.example.RentWheels.models.User.Role;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserReadModel {

    private Long id;

    private String name;

    private String email;

    private Role role;
}
