package com.patterns.factory_method;

public class SportCarFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new SportCar();
    }
}
