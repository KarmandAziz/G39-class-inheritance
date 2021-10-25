package org.example.exercises;

public class Motorcycle extends Vehicle{

    private String motorcycleType;
    private String maxSpeed;
    private double motorSize;

    public Motorcycle(int vehicleID, String regNum, String brand, int year, String motorcycleType, String maxSpeed, double motorSize) {
        super(vehicleID, regNum, brand, year);
        setMotorcycleType(motorcycleType);
        setMaxSpeed(maxSpeed);
        setMotorSize(motorSize);
    }

    @Override
    public void drive() {
        System.out.println(getMotorcycleType() +" Motorcycle is driving..");
    }


    public String getMotorcycleType() {
        return motorcycleType;
    }
    @Override
    public String toString(){
        return "Motorcycle type: " + motorcycleType +"\n"+
                "Max Speed: " + maxSpeed + "\n"+
                "Motor size: " + motorSize;
    }
    public void setMotorcycleType(String motorcycleType) {
        this.motorcycleType = motorcycleType;
    }

    public String getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getMotorSize() {
        return motorSize;
    }

    public void setMotorSize(double motorSize) {
        this.motorSize = motorSize;
    }
}
