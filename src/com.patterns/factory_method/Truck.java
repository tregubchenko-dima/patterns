package com.patterns.factory_method;

public class Truck implements Car{
    @Override
    public String getName() {
        return "truck";
    }

    @Override
    public int getSpeed() {
        return 100;
    }
}
