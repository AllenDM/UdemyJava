package com.allenmoody;

public class Tesla extends Car{

    private int autopilot;
    private int frunkVolume;
    private double chargePercentage;
    private double range;

    public Tesla(String model, String color, int maxHorsepower, int maxTorque, double height,
                 double length, double weight, double speed, int gear, double trunkVolume,
                 double cabinVolume, int autopilot, int frunkVolume, double chargePercentage, double range) {
        super("Tesla", model, color, maxHorsepower, maxTorque, height, length, weight, speed, gear, 0, 0,
                trunkVolume, cabinVolume);
        this.autopilot = autopilot;
        this.frunkVolume = frunkVolume;
        this.chargePercentage = chargePercentage;
        this.range = range;
    }

    public void engageAutopilot() {
        autopilot = 1;
        System.out.println("Autopilot engaged");
    }

    public void disengageAutopilot() {
        autopilot = 0;
        System.out.println("Autopilot disengaged");
    }


}
