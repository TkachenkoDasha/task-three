package task1;

import java.util.List;

public class StarSystem extends SpaceObject {
    private List<Planet> planets;
    private Star star;

    public StarSystem(String name, double weight, List<Planet> planets, Star star) {
        super(name, weight);
        this.planets = planets;
        this.star = star;
    }

    public List<Planet> getPlanets() {
        return planets;
    }

    public void setPlanets(List<Planet> planets) {
        this.planets = planets;
    }

    public Star getStar() {
        return star;
    }

    public void setStar(Star star) {
        this.star = star;
    }

    public void addPlanet(Planet newPlanet) {
        planets.add(newPlanet);
    }

    public void removePlanet(Planet planet) {
        planets.remove(planet);
    }


}

