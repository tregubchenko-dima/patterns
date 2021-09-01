package patterns.factory;

public class ModernCarFactory {

    public ModernCar createCar(ModernCarType carType){
        ModernCar car;

        switch (carType){
            case BMW:
                car = new BMW();
                break;
            case AUDI:
                car = new Audi();
                break;
            case MERCEDES:
                car = new Mercedes();
                break;
            default:
                throw new IllegalArgumentException("Wrong car type:" + carType);
        }

        return car;
    }
}
