package com.allenmoody;

public class Car extends Vehicle {

    private int lowBeams;
    private int highBeams;
    private double trunkVolume;
    private double cabinVolume;

    public Car(String make, String model, String color , int maxHorsepower, int maxTorque , double height,
               double length, double weight, double speed, int gear ,int lowBeams, int highBeams, double trunkVolume,
               double cabinVolume){

        super(make, model, color, maxHorsepower, maxTorque, height, length, weight, speed, gear);

        this.lowBeams = lowBeams;
        this.highBeams = highBeams;
        this.trunkVolume = trunkVolume;
        this.cabinVolume = cabinVolume;

    }


    public void openTrunk() {
        System.out.println("Car trunk open");
    }




}
