package org.example.exercises;

public class Truck extends Vehicle{


    private String truckType;
    private String maxSpeed;
    private String maxWeight;
    private String maxRange;


    public Truck(int vehicleID,
                 String regNum,
                 String brand, int year,
                 String truckType,
                 String maxSpeed,
                 String maxWeight,
                 String maxRange) {
        super(vehicleID, regNum, brand, year);
        setTruckType(truckType);
        setMaxRange(maxRange);
        setMaxWeight(maxWeight);
        setMaxSpeed(maxSpeed);
    }

    @Override
    public void drive() {
        System.out.println(getTruckType() +" is driving...");
    }
    @Override
    public String toString(){
        return "Max speed: " + maxSpeed + "\n"+
                "Max weight: " + maxWeight + "\n"+
                "Max range: " + maxRange;
    }

    public String getTruckType() {
        return truckType;
    }

    public void setTruckType(String truckType) {
        this.truckType = truckType;
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
