package patterns.builder.v2;

public abstract class CarBuilder {

    protected Car car;

    public CarBuilder(){
        this.car = new Car();
    }

    public abstract void chooseCarName();
    public abstract void addTransmission();
    public abstract void setMaxCarSpeed();

    public Car getCar(){
        return car;
    }
}
