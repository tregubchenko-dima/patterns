package com.patterns.factory_method;

public class SportCar implements Car{
    @Override
    public String getName() {
        return "sport car";
    }

    @Override
    public int getSpeed() {
        return 200;
    }
}
