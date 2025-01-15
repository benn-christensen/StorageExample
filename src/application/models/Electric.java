package application.models;

public class Electric extends Car {
    private int batterySize;
    public Electric(String make, String model, int price, int batterySize) {
        super(make, model, price);
        this.batterySize = batterySize;
    }
}
