package org.example.exercises;

public abstract class Vehicle {

    private int VehicleID;
    private String regNum;
    private String brand;
    private int year;


    public Vehicle(int vehicleID, String regNum, String brand, int year) {
        VehicleID = vehicleID;
        this.regNum = regNum;
        this.brand = brand;
        this.year = year;
    }
}
