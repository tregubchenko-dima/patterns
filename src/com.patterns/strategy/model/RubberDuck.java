package com.patterns.strategy.model;

import com.patterns.strategy.behavior.FlyNoWay;
import com.patterns.strategy.behavior.Squeak;

public class RubberDuck extends Duck{

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("I am a Rubber Duck!");
    }
}
