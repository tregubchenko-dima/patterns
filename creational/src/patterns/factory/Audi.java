package patterns.factory;

public class Audi extends ModernCar {
    @Override
    protected String getName() {
        return ModernCarType.AUDI.toString();
    }
}
