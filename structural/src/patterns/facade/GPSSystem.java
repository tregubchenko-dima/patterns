package patterns.facade;

import patterns.facade.diffComponents.GPSNotifier;
import patterns.facade.diffComponents.GPSPower;
import patterns.facade.diffComponents.RoadAdviser;

public class GPSSystem {

    private GPSPower power;
    private GPSNotifier notifier;
    private RoadAdviser adviser;

    public GPSSystem(GPSPower power, GPSNotifier notifier, RoadAdviser adviser){
        this.power = power;
        this.notifier = notifier;
        this.adviser = adviser;
    }

    public void activate(){
        power.powerOn();
        notifier.downloadRoadInfo();
        adviser.route();
    }

    public void deactivate(){
        power.powerOff();
    }
}
