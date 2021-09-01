package patterns.prototype;

public class CargosCar extends Transport {

    private int cargoWeight;

    public CargosCar(){

    }

    public CargosCar(CargosCar car) {
        super(car);
        this.cargoWeight = car.cargoWeight;
    }

    @Override
    public Transport clone() {
        return new CargosCar(this);
    }

    public void setCargoWeight(int cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CargosCar cargosCar = (CargosCar) o;
        return cargoWeight == cargosCar.cargoWeight;
    }


}
