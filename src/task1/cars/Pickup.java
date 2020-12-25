package task1.cars;

public class Pickup extends Car {

    public Pickup(String name, double price, double fuelConsumption, double speed) {
        super(name, price, fuelConsumption, speed);
    }

    @Override
    public void description() {
        System.out.println("Pickup");
    }
}
