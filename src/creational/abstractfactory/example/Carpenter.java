package creational.abstractfactory.example;

public class Carpenter implements DoorFittingExpert {
    @Override
    public void getDescription() {
        System.out.println("I can only fit wooden doors");
    }
}
