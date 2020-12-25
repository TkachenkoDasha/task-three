package task2;

import java.util.Collections;
import java.util.List;

public class Planet extends SpaceObject {

    private List<Satellite> satellites;

    public Planet(String name, double weight) {
        super(name, weight);
        this.satellites = Collections.emptyList();
    }

    public Planet(String name, double weight, List<Satellite> satellites) {
        super(name, weight);
        this.satellites = satellites;
    }

    public List<Satellite> getSatellites() {
        return satellites;
    }

    public void setSatellites(List<Satellite> satellites) {
        this.satellites = satellites;
    }

    public void addSatellite(Satellite newSatellite) {
        satellites.add(newSatellite);
    }

    public void removeSatellite(Satellite satellite) {
        satellites.remove(satellite);
    }

}
