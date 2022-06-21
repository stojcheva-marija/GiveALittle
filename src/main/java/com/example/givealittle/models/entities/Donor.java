package com.example.givealittle.models.entities;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Donor {

    @Id
    private Long id;
    private String username;
    private String password;
    private String contactInfo;
    @OneToMany(fetch = FetchType.EAGER)
    private List<Product> productList;

    public Donor(String username, String password, String contactInfo) {
        this.username = username;
        this.password = password;
        this.contactInfo = contactInfo;
        this.productList = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
