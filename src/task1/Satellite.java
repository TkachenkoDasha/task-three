package task1;

public class Satellite extends SpaceObject {
    private double distanceToPlanet;

    public Satellite(String name, double weight, double distanceToPlanet) {
        super(name, weight);
        this.distanceToPlanet = distanceToPlanet;
    }

    public double getDistanceToPlanet() {
        return distanceToPlanet;
    }

    public void setDistanceToPlanet(double distanceToPlanet) {
        this.distanceToPlanet = distanceToPlanet;
    }
}
