package simplefactory;

public class MainSimpleFactory {
    public static void main(String[] args) {
        Door door = DoorFactory.makeDoor(100, 100);

        System.out.println(door.getWidth());
        System.out.println(door.getHeight());
    }
}
