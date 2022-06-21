package com.example.givealittle.models.entities;

import javax.persistence.Entity;

@Entity
public class Citizen extends Donor{

    public Citizen() {
        super();
    }

    public Citizen(String username, String password, String contactInfo,
                   String companyInfo, String companyImage, String socialMediaInfo) {
        super(username, password, contactInfo);
    }
}
