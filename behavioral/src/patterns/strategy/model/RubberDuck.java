package patterns.strategy.model;

import patterns.strategy.behavior.FlyNoWay;
import patterns.strategy.behavior.Squeak;

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
