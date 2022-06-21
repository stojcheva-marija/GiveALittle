package com.example.givealittle.service;

import com.example.givealittle.models.entities.Donor;

public interface UserService{
    Donor findById(Integer id);
    Donor findByEmail(String email);
    Donor register(String name, String surname, String username, String password, String repeatPassword);
    Donor getAuthenticatedUser();
    Donor update(Donor user, String name, String surname, Integer age, String address, String email, String password, String confirmPassword);

}
