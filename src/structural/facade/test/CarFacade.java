package structural.facade.test;

public class CarFacade {
    protected Car car;

    public CarFacade(Car car) {
        this.car = car;
    }

    public void startEngine() {
        System.out.println("Start engine...");
        this.car.pushKey();
        this.car.rotateKey();
        this.car.machineOn();
    }

    public void stopEngine() {
        System.out.println("Stop engine...");
        this.car.pullKey();
        this.car.machineOff();
    }
}
