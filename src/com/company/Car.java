package com.company;

public class Car extends Vehicle{
    private String name;
    private int doors;


    public Car(String capacity, int weight, int yearOfBuild, String colour, String name, int doors) {
        super(capacity, weight, yearOfBuild, colour, 4);
        this.name= name;
        this.doors = doors;
    }


}
