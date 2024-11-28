package storage;

import application.models.Car;

import java.util.ArrayList;

public class Storage {
    private static ArrayList<Car> cars = new ArrayList<>();

    public static void addCar(Car car) {
        if (!cars.contains(car)) {
            cars.add(car);
        }
    }

    public static Car getCarById(int id) {
        for (Car car : cars) {
            if (car.getId() == id) {
                return car;
            }
        }
        return null;
    }

    public static ArrayList<Car> getCars() {
        return new ArrayList<>(cars);
    }
}
