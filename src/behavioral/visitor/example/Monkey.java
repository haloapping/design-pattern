package behavioral.visitor.example;

public class Monkey implements Animal {
    public void shout() {
        System.out.println("Monkey: Ooh oo aa aa!");
    }

    @Override
    public void accept(AnimalOperation operation) {
        operation.visitMonkey(this);
    }
}
