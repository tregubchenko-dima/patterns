package com.patterns.prototype;

import java.util.Objects;

public class SportsCar extends Transport {

    private Boolean isTurbochargedEngine;

    public SportsCar(){

    }

    public SportsCar(SportsCar car) {
        super(car);
        this.isTurbochargedEngine = car.isTurbochargedEngine;
    }

    public Transport clone() {
        return new SportsCar(this);
    }

    public void setTurbochargedEngine(Boolean turbochargedEngine) {
        isTurbochargedEngine = turbochargedEngine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SportsCar sportsCar = (SportsCar) o;
        return Objects.equals(isTurbochargedEngine, sportsCar.isTurbochargedEngine);
    }


}
