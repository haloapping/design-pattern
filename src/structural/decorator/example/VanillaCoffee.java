package structural.decorator.example;

public class VanillaCoffee implements Coffee {
    protected Coffee coffee;

    public VanillaCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public int getCost() {
        return this.coffee.getCost() + 3;
    }

    @Override
    public String getDescription() {
        return this.coffee.getDescription() + ", vanilla";
    }
}
