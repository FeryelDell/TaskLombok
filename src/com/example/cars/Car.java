package com.example.cars;

import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Car {
    private String model;
    private String brand;
    private int year;
    private double price;
    private String color;
    private int seats;
}
