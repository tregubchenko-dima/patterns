package com.patterns.factory;

public class BMW extends Car{
    @Override
    protected String getName() {
        return CarType.BMW.toString();
    }
}
