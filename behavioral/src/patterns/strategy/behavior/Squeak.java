package patterns.strategy.behavior;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Утка пищит");
    }
}
