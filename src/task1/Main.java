package task1;

import task1.cars.Car;
import task1.cars.Hatchback;
import task1.cars.Sedan;
import task1.cars.Suv;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Hatchback hatchback = new Hatchback("Nissan", 7678.8, 5, 200);
        Sedan sedan = new Sedan("Audi", 1000,5,190);
        Suv suv = new Suv("Jeep", 2000,15,220);
        List<Car> cars = Arrays.asList(hatchback, sedan, suv);
//        List<Car> cars = new ArrayList<>();
//        cars.add(hatchback);
//        cars.add(sedan);
//        cars.add(suv);

        TaxiPark taxiPark = new TaxiPark(cars);
        taxiPark.findCarBySpeed(189, 205).forEach(System.out::println);

        System.out.println();

        taxiPark.sortByFuelConsumption();
        taxiPark.getCars().forEach(System.out::println);

        System.out.println();

        double totalPrice = taxiPark.findTotalPrice();
        System.out.println("Total price of taxipark: " + totalPrice);
    }
}
