package com.patterns.factory_method;

public class FactoryMethodTest {

    public static void main(String[] args){

        CarFactory carFactory = new SportCarFactory();

        Car sportCar = carFactory.createCar();
        System.out.println(sportCar.getName() + " is driving with speed: " + sportCar.getSpeed());

        carFactory = new TruckFactory();
        Car truck = carFactory.createCar();
        System.out.println(truck.getName() + " is driving with speed: " + truck.getSpeed());
    }
}
