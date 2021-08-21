package com.patterns.factory;

public class CarFactory {

    public Car createCar(CarType carType){
        Car car;

        switch (carType){
            case BMW:
                car = new BMW();
                break;
            case AUDI:
                car = new Audi();
                break;
            case MERCEDES:
                car = new Mercedes();
                break;
            default:
                throw new IllegalArgumentException("Wrong car type:" + carType);
        }

        return car;
    }
}
