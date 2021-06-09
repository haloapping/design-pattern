package creational.abstractfactory.example;

public class Main {
    public static void main(String[] args) {
        WoodenDoorFactory woodenDoorFactory = new WoodenDoorFactory();
        Door woodenDoor = woodenDoorFactory.makeDoor();
        DoorFittingExpert expert = woodenDoorFactory.makeFittingExpert();
        woodenDoor.getDescription();
        expert.getDescription();

        IronDoorFactory ironDoorFactory = new IronDoorFactory();
        Door ironDoor = ironDoorFactory.makeDoor();
        DoorFittingExpert expert1 = ironDoorFactory.makeFittingExpert();
        ironDoor.getDescription();;
        expert1.getDescription();
    }
}
