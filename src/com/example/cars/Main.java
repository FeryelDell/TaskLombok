package com.example.cars;

public class Main {
    public static void main(String[] args) {

        // Two *different* cars
        Car car1 = new Car("Civic", "Honda", 2022, 23500.0, "Blue", 5);
        Car car2 = new Car("Mustang", "Ford", 2018, 41000.0, "Red", 2);

        System.out.println("car1: " + car1);
        System.out.println("car2: " + car2);

        System.out.println("Are they equal? " + car1.equals(car2));
        System.out.println("HashCode car1: " + car1.hashCode());
        System.out.println("HashCode car2: " + car2.hashCode());
    }
}
