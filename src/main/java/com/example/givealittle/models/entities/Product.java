package com.example.givealittle.models.entities;

import com.example.givealittle.models.enums.Category;

import javax.persistence.*;

@Entity
public class Product {
    @Id
    private Long id;
    private String title;
    private String imageUrl;
    private int state;
    private int quantity;
    private String location;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "donor_id")
    private Donor donor;
    @Enumerated(value = EnumType.STRING)
    private Category category;

}
