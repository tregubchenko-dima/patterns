package com.patterns.factory_method;

public class TruckFactory implements CarFactory{

    @Override
    public Car createCar() {
        return new Truck();
    }
}
