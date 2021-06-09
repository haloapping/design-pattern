package creational.builder.example;

public class BurgerBuilder {
    protected int size;
    protected boolean cheese;
    protected boolean pepperoni;
    protected boolean lettuce;
    protected boolean tomato;

    public BurgerBuilder(int size) {
        this.size = size;
    }

    public BurgerBuilder addPepperoni() {
        this.pepperoni = true;
        return this;
    }

    public BurgerBuilder addLettuce() {
        this.lettuce = true;
        return this;
    }

    public BurgerBuilder addCheese() {
        this.cheese = true;
        return this;
    }

    public BurgerBuilder addTomato() {
        this.tomato = true;
        return this;
    }

    public Burger create() {
        return new Burger(this);
    }
}
