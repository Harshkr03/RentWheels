package com.example.RentWheels.repositories.writes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.RentWheels.models.User;

@Repository
public interface UserWriteRepository extends JpaRepository<User, Long> {
}
