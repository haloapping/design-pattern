package creational.abstractfactory.example;

public class WoodenDoor implements Door {
    @Override
    public void getDescription() {
        System.out.println("I am wooden door");
    }
}
