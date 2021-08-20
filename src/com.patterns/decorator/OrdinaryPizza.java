package com.patterns.decorator;

public class OrdinaryPizza implements Pizza{
    @Override
    public String bake() {
        return "Bake an ordinary pizza ";
    }

    @Override
    public int cost() {
        return 100;
    }
}
