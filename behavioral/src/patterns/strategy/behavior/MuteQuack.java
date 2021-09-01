package patterns.strategy.behavior;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Не издает звуков!");
    }
}
