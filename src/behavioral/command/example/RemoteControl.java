package behavioral.command.example;

public class RemoteControl {
    public void submit(Command command) {
        command.execute();
    }
}
