package task1.cars;

public class Suv extends Car {

    public Suv(String name, double price, double fuelConsumption, double speed) {
        super(name, price, fuelConsumption, speed);
    }

    @Override
    public void description() {
        System.out.println("SUV");
    }
}
