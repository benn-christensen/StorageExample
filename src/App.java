import application.Controller;
import application.models.Car;

public class App {
    public static void main(String[] args) {
        Controller.createCar("Honda", "Civic", 130_000);
        Controller.createCar("Skoda", "Eniaq", 330_000);
        for (Car car : Controller.getCars()) {
            System.out.println(car);
        }
        Controller.updatePrice(2, 290_000);
        for (Car car : Controller.getCars()) {
            System.out.println(car);
        }
    }
}
