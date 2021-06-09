package simplefactory.test;

public class Main {
    public static void main(String[] args) {
        Door door = DoorFactory.makeDoor(10.45f, 10);

        System.out.println("Door");
        System.out.println("Width  : " + door.getWidth());
        System.out.println("Height : " + door.getWidth());
    }
}
