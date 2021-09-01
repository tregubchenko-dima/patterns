package patterns.factory_method;

public class SportCarFactory implements CarFactory{
    @Override
    public Cars createCar() {
        return new SportCar();
    }
}
