package org.example.exercises;

public class Car extends Vehicle{

    private int numOfDoors;
    private int numOfPassengers;
    private String colour;


    public Car(int vehicleID, String regNum, String brand, int year, int numOfDoors, int numOfPassengers, String colour) {
        super(vehicleID, regNum, brand, year);
        setNumOfDoors(numOfDoors);
        setNumOfPassengers(numOfPassengers);
        setColour(colour);
    }

    @Override
    public void drive() {
        System.out.println("Car is driving, brum brum..");
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }

    public void setNumOfDoors(int numOfDoors) {
        this.numOfDoors = numOfDoors;
    }

    public int getNumOfPassengers() {
        return numOfPassengers;
    }

    public void setNumOfPassengers(int numOfPassengers) {
        this.numOfPassengers = numOfPassengers;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
