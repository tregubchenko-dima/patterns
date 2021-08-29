package com.patterns.builder.v2;

public class Car {

    private String name;
    private String transmission;
    private int speed;

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", transmission='" + transmission + '\'' +
                ", speed=" + speed +
                '}';
    }
}
