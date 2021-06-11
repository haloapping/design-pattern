package behavioral.visitor.example;

public interface Animal {
    void accept(AnimalOperation operation);
}
