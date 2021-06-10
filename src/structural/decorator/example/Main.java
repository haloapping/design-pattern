package structural.decorator.example;

public class Main {
    public static void main(String[] args) {
        SimpleCoffee someCoffee = new SimpleCoffee();
        System.out.println("Description : " + someCoffee.getDescription());
        System.out.println("Cost        : " + someCoffee.getCost() + "\n");

        MilkCoffee milkCoffee = new MilkCoffee(someCoffee);
        System.out.println("Description : " + milkCoffee.getDescription());
        System.out.println("Cost        : " + milkCoffee.getCost() + "\n");

        WhipCoffee whipCoffee = new WhipCoffee(milkCoffee);
        System.out.println("Description : " + whipCoffee.getDescription());
        System.out.println("Cost        : " + whipCoffee.getCost() + "\n");

        VanillaCoffee vanillaCoffee = new VanillaCoffee(whipCoffee);
        System.out.println("Description : " + vanillaCoffee.getDescription());
        System.out.println("Cost        : " + vanillaCoffee.getCost() + "\n");
    }
}
