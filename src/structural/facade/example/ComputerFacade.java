package structural.facade.example;

public class ComputerFacade {
    protected Computer computer;

    public ComputerFacade(Computer computer) {
        this.computer = computer;
    }

    public void turnOn() {
        System.out.println("Turn on computer...");
        this.computer.getElectricShock();
        this.computer.makeSound();
        this.computer.showLoadingScreen();
        this.computer.bam();
    }

    public void turnOff() {
        System.out.println("Turn off computer...");
        this.computer.closeEverything();
        this.computer.pullCurrent();
        this.computer.sooth();
    }
}
