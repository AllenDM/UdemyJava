package com.allenmoody;

public class Main {

    public static void main(String[] args) {
        Tesla modelS = new Tesla("Model S", "Blue", 600, 800, 62, 110,
                5000, 0,1, 0,0,52,100,0,
                20);

        modelS.startVehicle();
        modelS.accelerate(10);
        modelS.accelerate(20);
        modelS.accelerate(30);
        modelS.engageAutopilot();
        modelS.increaseGear();
        modelS.disengageAutopilot();
        modelS.decelerate(50);
        modelS.decreaseGear();
        modelS.decelerate(10);
        System.out.println(modelS.getColor());





















    }


}
