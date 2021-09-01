package patterns.builder.v2;

public class OrdinaryCarBuilder extends CarBuilder{
    @Override
    public void chooseCarName() {
        car.setName("WV Polo Sedan");
    }

    @Override
    public void addTransmission() {
        car.setTransmission("MANUAL");
    }

    @Override
    public void setMaxCarSpeed() {
        car.setSpeed(220);
    }
}
