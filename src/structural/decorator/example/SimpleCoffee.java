package structural.decorator.example;

public class SimpleCoffee implements Coffee {
    protected Coffee coffee;

    @Override
    public int getCost() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "Simple coffee";
    }
}
