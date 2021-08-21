package com.patterns.factory;

public class Audi extends Car{
    @Override
    protected String getName() {
        return CarType.AUDI.toString();
    }
}
