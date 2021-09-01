package patterns.strategy.model;

import patterns.strategy.behavior.FlyNoWay;
import patterns.strategy.behavior.MuteQuack;

public class DecoyDuck extends Duck{

    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("I am a Decoy Duck!");
    }
}
