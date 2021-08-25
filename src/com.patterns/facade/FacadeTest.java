package com.patterns.facade;

import com.patterns.facade.diffComponents.GPSNotifier;
import com.patterns.facade.diffComponents.GPSPower;
import com.patterns.facade.diffComponents.RoadAdviser;

public class FacadeTest {

    public static void main(String[] args){

        GPSPower power = new GPSPower();
        GPSNotifier notifier = new GPSNotifier();
        RoadAdviser adviser = new RoadAdviser();

        GPSSystem gpsSystem = new GPSSystem(power, notifier,adviser);

        gpsSystem.activate();
        System.out.println("A user is using the gps system");
        gpsSystem.deactivate();
    }
}
