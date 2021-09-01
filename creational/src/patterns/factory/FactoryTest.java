package patterns.factory;

public class FactoryTest {

    public static void main(String[] args){

        ModernCarFactory carFactory = new ModernCarFactory();

        ModernCar audi = carFactory.createCar(ModernCarType.AUDI);
        ModernCar bmw = carFactory.createCar(ModernCarType.BMW);
        ModernCar mercedes = carFactory.createCar(ModernCarType.MERCEDES);

        audi.drive();
        bmw.drive();
        mercedes.drive();
    }
}
