package com.example.givealittle.models.entities;

import javax.persistence.Entity;

@Entity
public class Company extends Donor{

    private String companyInfo;
    private String companyImage;
    private String socialMediaInfo;

    public Company() {
        super();
    }

    public Company(String username, String password, String contactInfo,
                   String companyInfo, String companyImage, String socialMediaInfo) {
        super(username, password, contactInfo);
        this.companyInfo = companyInfo;
        this.companyImage = companyImage;
        this.socialMediaInfo = socialMediaInfo;
    }
}
