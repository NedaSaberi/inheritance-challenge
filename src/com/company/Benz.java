package com.company;

public class Benz extends Car{
    private String model;

    public Benz(String capacity, int weight, int yearOfBuild, String colour, String model) {
        super(capacity, weight, yearOfBuild, colour, "Benz", 4);
        this.model = model;
    }
}
