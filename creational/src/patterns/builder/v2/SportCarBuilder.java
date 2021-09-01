package patterns.builder.v2;

public class SportCarBuilder extends CarBuilder{

    public SportCarBuilder() {
        super();
    }

    @Override
    public void chooseCarName() {
        car.setName("Audi RS6");
    }

    @Override
    public void addTransmission() {
        car.setTransmission("AUTO");
    }

    @Override
    public void setMaxCarSpeed() {
        car.setSpeed(320);
    }
}
