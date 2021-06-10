package structural.facade.example;

public class Main {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade(new Computer());

        computer.turnOn();
        System.out.println();
        computer.turnOff();
    }
}
