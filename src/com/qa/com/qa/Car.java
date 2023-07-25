package com.qa.com.qa;

public class Car {
    private double engine_capacity;
    private int no_of_seats;
    private double weight;
    private int doors;

    public Car(double engine_capacity, int no_of_seats, double weight, int doors) {
        this.engine_capacity = engine_capacity;
        this.no_of_seats = no_of_seats;
        this.weight = weight;
        this.doors = doors;
    }

    public double getEngine_capacity() {
        return engine_capacity;
    }

    public void setEngine_capacity(double engine_capacity) {
        this.engine_capacity = engine_capacity;
    }

    public int getNo_of_seats() {
        return no_of_seats;
    }

    public void setNo_of_seats(int no_of_seats) {
        this.no_of_seats = no_of_seats;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
}
