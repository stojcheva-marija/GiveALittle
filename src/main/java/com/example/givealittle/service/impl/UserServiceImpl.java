package com.example.givealittle.service.impl;

import com.example.givealittle.models.entities.Donor;
import com.example.givealittle.repository.DonorRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl {

    private final DonorRepository donorRepository;

}
