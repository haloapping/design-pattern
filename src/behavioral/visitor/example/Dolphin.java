package behavioral.visitor.example;

public class Dolphin implements Animal {
    public void speak() {
        System.out.println("Dolphin: Tuut tuttu tuutt!");
    }

    @Override
    public void accept(AnimalOperation operation) {
        operation.visitDolphin(this);
    }
}
