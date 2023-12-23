package com.example.tpdevops.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data @NoArgsConstructor @ToString
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private Double price;
    public Product(String name, String description, Double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }
}
