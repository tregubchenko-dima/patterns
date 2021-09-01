package patterns.prototype;

public class PrototypeTest {

    public static void main(String[] args){
        CargosCar cargoCar = new CargosCar();
        cargoCar.setCargoWeight(10000);
        cargoCar.setColor("GREEN");
        cargoCar.setMaxSpeed(100);
        System.out.println(cargoCar);

        CargosCar cargoCarCopy = (CargosCar) cargoCar.clone();
        System.out.println(cargoCarCopy);
        System.out.println(cargoCar.equals(cargoCarCopy));

        SportsCar sportCar = new SportsCar();
        sportCar.setColor("RED");
        sportCar.setMaxSpeed(300);
        sportCar.setTurbochargedEngine(true);
        System.out.println(sportCar);

        SportsCar sportCarCopy = (SportsCar) sportCar.clone();
        System.out.println(sportCarCopy);
        System.out.println(sportCar.equals(sportCarCopy));
    }
}
