package com.patterns.builder.v2;

public class CarDirector {

    private CarBuilder carBuilder;

    public void setCarBuilder(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public Car build(){
        carBuilder.chooseCarName();
        carBuilder.addTransmission();
        carBuilder.setMaxCarSpeed();
        return carBuilder.getCar();
    }
}
