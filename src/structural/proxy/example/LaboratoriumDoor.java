package structural.proxy.example;

public class LaboratoriumDoor implements Door {
    @Override
    public void open() {
        System.out.println("Opening laboratorium");
    }

    @Override
    public void close() {
        System.out.println("Closing the laboratorium");
    }
}
