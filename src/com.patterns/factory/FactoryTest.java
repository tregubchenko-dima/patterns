package com.patterns.factory;

public class FactoryTest {

    public static void main(String[] args){

        CarFactory carFactory = new CarFactory();

        Car audi = carFactory.createCar(CarType.AUDI);
        Car bmw = carFactory.createCar(CarType.BMW);
        Car mercedes = carFactory.createCar(CarType.MERCEDES);

        audi.drive();
        bmw.drive();
        mercedes.drive();
    }
}
