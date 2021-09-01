package patterns.factory_method;

public class SportCar implements Cars {
    @Override
    public String getName() {
        return "sport car";
    }

    @Override
    public int getSpeed() {
        return 200;
    }
}
