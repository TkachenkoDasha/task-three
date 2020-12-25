package task1.cars;

public class Limousine extends Car {

    public Limousine(String name, double price, double fuelConsumption, double speed) {
        super(name, price, fuelConsumption, speed);
    }

    @Override
    public void description() {
        System.out.println("Limousine");
    }
}
