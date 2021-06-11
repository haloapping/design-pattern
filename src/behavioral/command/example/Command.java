package behavioral.command.example;

public interface Command {
    public void execute();

    public void undo();

    public void redo();
}
