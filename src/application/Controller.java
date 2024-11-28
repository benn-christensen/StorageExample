package application;

import application.models.Car;
import storage.Storage;

import java.util.ArrayList;

public class Controller {
    public static Car createCar(String make, String model, int price) {
        Car newCar = new Car(make, model, price);
        Storage.addCar(newCar);
        return newCar;
    }

    public static void updatePrice(int id, int newPrice) {
        Car car = Storage.getCarById(id);
        if (car != null) {
            car.setPrice(newPrice);
        }
    }

    public static ArrayList<Car> getCars() {
        return Storage.getCars();
    }
}
