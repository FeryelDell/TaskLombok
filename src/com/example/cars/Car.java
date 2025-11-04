package com.example.cars;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor


public class Car {
    private String model;
    private String brand;
    private int year;
    private double price;
    private String color;
    private int quantity;
}
