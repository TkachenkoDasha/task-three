package task1.cars;

public class Hatchback extends Car {

    public Hatchback(String name, double price, double fuelConsumption, double speed) {
        super(name, price, fuelConsumption, speed);
    }

    @Override
    public void description() {
        System.out.println("Hatchback");
    }
}
