package org.example.exercises;

public class Truck extends Vehicle{

    private String maxSpeed = "30 Km/h";
    private String maxWeight = "5000 KG";
    private String maxRange = "450 KM";


    public Truck(int vehicleID,
                 String regNum,
                 String brand, int year,
                 String maxSpeed,
                 String maxWeight,
                 String maxRange) {
        super(vehicleID, regNum, brand, year);
        setMaxRange(maxRange);
        setMaxWeight(maxWeight);
        setMaxSpeed(maxSpeed);
    }

    @Override
    public void drive() {
        System.out.println("Truck is driving...");
    }

    public String getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(String maxWeight) {
        this.maxWeight = maxWeight;
    }

    public String getMaxRange() {
        return maxRange;
    }

    public void setMaxRange(String maxRange) {
        this.maxRange = maxRange;
    }
}
