package com.example.givealittle.repository;

import com.example.givealittle.models.entities.Donor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DonorRepository extends JpaRepository<Donor,Long> {

    Optional<Donor> findByUsername(String username);
}
