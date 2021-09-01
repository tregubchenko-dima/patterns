package patterns.factory_method;

public class TruckFactory implements CarFactory{

    @Override
    public Cars createCar() {
        return new Truck();
    }
}
