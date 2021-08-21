package com.patterns.factory;

public class Mercedes extends Car{
    @Override
    protected String getName() {
        return CarType.MERCEDES.toString();
    }
}
