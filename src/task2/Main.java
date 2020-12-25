package task2;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Satellite satellite1 = new Satellite("Xerox", 5454.54, 654658.55);
        Satellite satellite2 = new Satellite("Zerox", 8515.56, 545148.47);
        List<Satellite> satellites = Arrays.asList(satellite1, satellite2);

        Planet planet1 = new Planet("Navi", 874568465.579, satellites);
        Planet planet2 = new Planet("Mercury",4788965.78);
        List<Planet> planets = Arrays.asList(planet1, planet2);

        Star star = new Star("Sirius", 78965231.54, "White dwarf");

        StarSystem starSystem = new StarSystem("Sirius System", 85623586428564.589, planets, star);

        System.out.println("Name of the star of the star system: " + starSystem.getStar().getName());
        System.out.println("Number of planets in the system: " + starSystem.getPlanets().size());

    }
}
