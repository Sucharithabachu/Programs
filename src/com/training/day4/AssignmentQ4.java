package com.training.day4;

abstract class Vehicle {
    public abstract void startEngine();
    public abstract void stopEngine();
}

class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped");
    }
}

class MotorCycle extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("MotorCycle engine started");
    }

    @Override
    public void stopEngine() {
        System.out.println("MotorCycle engine stopped");
    }
}

public class AssignmentQ4 {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new MotorCycle();

        v1.startEngine();
        v1.stopEngine();
        v2.startEngine();
        v2.stopEngine();
    }
}
