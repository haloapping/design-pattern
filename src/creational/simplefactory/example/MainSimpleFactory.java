package creational.simplefactory.example;

public class MainSimpleFactory {
    public static void main(String[] args) {
        Door firstDoor = DoorFactory.makeDoor(100, 100);
        System.out.println("First Door");
        System.out.println("Width  : " + firstDoor.getWidth());
        System.out.println("Height : " + firstDoor.getHeight());

        Door secondDoor = DoorFactory.makeDoor(100.34f, 100.23f);
        System.out.println("\n" + "Second Door");
        System.out.println("Width  : " + secondDoor.getWidth());
        System.out.println("Height : " + secondDoor.getHeight());
    }
}
