package structural.facade.test;

public class Main {
    public static void main(String[] args) {
        CarFacade car = new CarFacade(new Car());

        car.startEngine();
        System.out.println();
        car.stopEngine();
    }
}
