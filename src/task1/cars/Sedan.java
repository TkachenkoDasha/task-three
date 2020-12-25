package task1.cars;

public class Sedan extends Car {

    public Sedan(String name, double price, double fuelConsumption, double speed) {
        super(name, price, fuelConsumption, speed);
    }

    @Override
    public void description() {
        System.out.println("Sedan");
    }
}
