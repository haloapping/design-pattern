package creational.abstractfactory.example;

public class IronDoorFactory implements DoorFactory {
    @Override
    public Door makeDoor() {
        return new IronDoor();
    }

    @Override
    public DoorFittingExpert makeFittingExpert() {
        return new Welder();
    }
}
