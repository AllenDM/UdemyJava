package com.allenmoody;

public class Vehicle {

    private String make;
    private String model;
    private String color;
    private int maxHorsepower;
    private int maxTorque;
    private double height;
    private double length;
    private double weight;
    private double speed;
    private int gear;


    public Vehicle (String make, String model, String color, int maxHorsepower, int maxTorque,
                    double height, double length, double weight, double speed, int gear) {

        this.make = make;
        this.model = model;
        this.color = color;
        this.maxHorsepower = maxHorsepower;
        this.maxTorque = maxTorque;
        this.height = height;
        this.length = length;
        this. weight = weight;
        this.speed = speed;
        this.gear = gear;

    }

    public void startVehicle() {
        System.out.println("Vehicle started");
    }

    public void accelerate(double speed) {
        this.speed += speed;
        System.out.println("Vehicle moving at " + this.speed);
    }

    public void decelerate(double speed) {
        this.speed -= speed;
        System.out.println("Vehicle moving at " + this.speed);
    }

    public void increaseGear() {
        gear += 1;
        System.out.println("Vehicle now in " + gear + " gear");
    }

    public void decreaseGear() {
        if (gear >=2) {
            gear -= 1;
            System.out.println("Vehicle now in " + gear + " gear");
        }
        else {
                System.out.println("Vehicle now in reverse");
            }
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getMaxHorsepower() {
        return maxHorsepower;
    }

    public int getMaxTorque() {
        return maxTorque;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public double getWeight() {
        return weight;
    }

    public double getSpeed() {
        return speed;
    }
}
