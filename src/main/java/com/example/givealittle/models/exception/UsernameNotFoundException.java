package com.example.givealittle.models.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "user not found")
public class UsernameNotFoundException extends RuntimeException{
    public UsernameNotFoundException(Integer id) {
        super(String.format("User with ID: %d not found.", id));
    }

    public UsernameNotFoundException(String email) {
        super(String.format("User with email: %s not found.", email));
    }
}



