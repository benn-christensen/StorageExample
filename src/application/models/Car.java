package application.models;

public class Car {
    private int id;
    private String make;
    private String model;
    private int price;
    private static int idCounter = 1;

    public Car(String make, String model, int price) {
        this.make = make;
        this.model = model;
        this.price = price;
        id = idCounter++;
    }

    public int getId() {
        return id;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return make + " " + model + " pris: " + price;
    }
}
