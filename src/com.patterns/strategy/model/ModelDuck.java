package com.patterns.strategy.model;

import com.patterns.strategy.behavior.FlyNoWay;
import com.patterns.strategy.behavior.Quack;

public class ModelDuck extends Duck{
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a Model Duck!");
    }
}
