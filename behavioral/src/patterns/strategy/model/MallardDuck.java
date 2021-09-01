package patterns.strategy.model;

import patterns.strategy.behavior.FlyWithWings;
import patterns.strategy.behavior.Quack;

public class MallardDuck extends Duck{

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a real Mallard Duck!");
    }
}
