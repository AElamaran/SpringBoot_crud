package com.example.crud1.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;
@Data
@AllArgsConstructor
@Component
@Entity
public class Product {
    @Id
    private int prodId;
    private String prodName;
    private double price;


    public Product() {

    }
}
