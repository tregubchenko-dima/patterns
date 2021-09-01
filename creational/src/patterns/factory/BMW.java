package patterns.factory;

public class BMW extends ModernCar {
    @Override
    protected String getName() {
        return ModernCarType.BMW.toString();
    }
}
