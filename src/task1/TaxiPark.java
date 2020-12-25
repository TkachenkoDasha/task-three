package task1;


import task1.cars.Car;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TaxiPark {

    private List<Car> cars;

    public TaxiPark(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public double findTotalPrice() {
        return cars.stream().mapToDouble(Car::getPrice).sum();
    }

    public void sortByFuelConsumption() {
        cars.sort(Comparator.comparing(Car::getFuelConsumption));
    }

    public List<Car> findCarBySpeed(double start, double end) {
        return cars.stream().filter(car -> car.getSpeed() >= start && car.getSpeed() <= end)
                .collect(Collectors.toList());
    }

}
