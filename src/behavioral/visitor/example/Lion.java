package behavioral.visitor.example;

public class Lion implements Animal {
    public void roar() {
        System.out.println("Lion: Roaaar!");
    }

    @Override
    public void accept(AnimalOperation operation) {
        operation.visitLion(this);
    }
}
