package patterns.strategy.model;

import patterns.strategy.behavior.FlyNoWay;
import patterns.strategy.behavior.Quack;

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
