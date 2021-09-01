package patterns.factory_method;

public class Truck implements Cars {
    @Override
    public String getName() {
        return "truck";
    }

    @Override
    public int getSpeed() {
        return 100;
    }
}
