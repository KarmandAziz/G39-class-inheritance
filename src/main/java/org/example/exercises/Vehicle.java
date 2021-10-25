package org.example.exercises;

public abstract class Vehicle {

    private int vehicleId;
    private String regNum;
    private String brand;
    private int year;


    public Vehicle(int vehicleID, String regNum, String brand, int year) {
        setVehicleId(vehicleID);
        setRegNum(regNum);
        setBrand(brand);
        setYear(year);
    }
    public abstract void drive();


    @Override
    public String toString(){
        return "Vehicle ID: " + vehicleId +"\n" +
        "Registration number: " + regNum +"\n" +
                "Brand: " + brand + "\n"+
                "Year: " + year;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getRegNum() {
        return regNum;
    }

    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
