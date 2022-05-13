package com.company;

public class Vehicle {
    private String capacity;
    private int weight;
    private int yearOfBuild;
    private String colour;
    private int wheels;

    public Vehicle(String size, int weight, int yearOfBuild, String colour, int wheels) {
        this.capacity = size;
        this.weight = weight;
        this.yearOfBuild = yearOfBuild;
        this.colour = colour;
        this.wheels = wheels;
    }

    public void geering(int geer){
        System.out.println("Geer on "+ geer);
    }

    public void steering(){

    }

    public void speed(){

    }

    public String getCapacity() {
        return capacity;
    }

    public int getWeight() {
        return weight;
    }

    public int getYearOfBuild() {
        return yearOfBuild;
    }

    public String getColour() {
        return colour;
    }

    public int getWheels() {
        return wheels;
    }
}
