package task1.cars;

public class Cabriolet extends Car {

    public Cabriolet(String name, double price, double fuelConsumption, double speed) {
        super(name, price, fuelConsumption, speed);
    }

    @Override
    public void description() {
        System.out.println("Cabriolet");
    }


}
