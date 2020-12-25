package task1.cars;

public class Minivan extends Car {

    public Minivan(String name, double price, double fuelConsumption, double speed) {
        super(name, price, fuelConsumption, speed);
    }

    @Override
    public void description() {
        System.out.println("Minivan");
    }
}
