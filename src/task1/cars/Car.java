package task1.cars;

public abstract class Car {
    private String name;
    private double price;
    private double fuelConsumption;
    private double speed;

    public Car(String name, double price, double fuelConsumption, double speed) {
        this.name = name;
        this.price = price;
        this.fuelConsumption = fuelConsumption;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public abstract void description();

    @Override
    public String toString() {
        return "Car {" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", fuelConsumption=" + fuelConsumption +
                ", speed=" + speed +
                '}';
    }
}
