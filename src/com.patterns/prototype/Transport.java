package com.patterns.prototype;

import java.util.Objects;

public abstract class Transport{

    private String color;
    private int maxSpeed;

    public Transport(Transport car){
        this.color = car.color;
        this.maxSpeed = car.maxSpeed;
    }

    public Transport() {

    }

    public abstract Transport clone();

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return maxSpeed == transport.maxSpeed && Objects.equals(color, transport.color);
    }

}
