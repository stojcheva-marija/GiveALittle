package com.example.givealittle.web.rest;

import com.example.givealittle.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/products")
public class ProductController {

    private final UserService userService;

    @GetMapping("/getAllProducts")
    private String getProducts(){
        return "all Products";
    }
}
