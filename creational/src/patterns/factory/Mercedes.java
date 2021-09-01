package patterns.factory;

public class Mercedes extends ModernCar {
    @Override
    protected String getName() {
        return ModernCarType.MERCEDES.toString();
    }
}
