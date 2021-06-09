package creational.builder.example;

public class Main {
    public static void main(String[] args) {
        Burger burger = new BurgerBuilder(14)
                .addCheese()
                .addLettuce()
                .addPepperoni()
                .addTomato()
                .create();

        System.out.println("Create burger with");
        System.out.println("Size      : " + burger.getSize());
        System.out.println("Cheese    : " + burger.isCheese());
        System.out.println("Lettuce   : " + burger.isLettuce());
        System.out.println("Pepperoni : " + burger.isPepperoni());
        System.out.println("Tomato    : " + burger.isTomato());
    }
}
