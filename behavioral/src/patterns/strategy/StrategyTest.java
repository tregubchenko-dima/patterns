package patterns.strategy;

import patterns.strategy.behavior.FlyWithWings;
import patterns.strategy.behavior.Squeak;
import patterns.strategy.model.*;
import patterns.strategy.model.*;

import java.util.ArrayList;
import java.util.List;

public class StrategyTest {

    public static void main(String[] args){
        Duck mallard = new MallardDuck();
        Duck model = new ModelDuck();
        Duck rubber = new RubberDuck();
        Duck decoy = new DecoyDuck();

        List<Duck> ducks = new ArrayList<>();
        ducks.add(mallard);
        ducks.add(model);
        ducks.add(rubber);
        ducks.add(decoy);

        ducks.forEach(duck -> {
            duck.display();
            duck.performFly();
            duck.performQuack();
        });

        decoy.performQuack();
        decoy.setQuackBehavior(new Squeak());
        decoy.performQuack();

        model.performFly();
        model.setFlyBehavior(new FlyWithWings());
        model.performFly();
    }
}
