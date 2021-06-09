package creational.simplefactory.glass;

public class Main {
    public static void main(String[] args) {
        Glass woodenGlass = new WoodenGlass(10, 10, 10.50f);
        System.out.println("Wooden glass");
        System.out.println("Weight : " + woodenGlass.getWeight());
        System.out.println("Height : " + woodenGlass.getHeight());
        System.out.println("Price  : " + woodenGlass.getPrice());

        Glass anotherWoodenGlass = new WoodenGlass(20, 20, 5.50f);
        System.out.println("\n" + "Another wooden glass");
        System.out.println("Weight : " + anotherWoodenGlass.getWeight());
        System.out.println("Height : " + anotherWoodenGlass.getHeight());
        System.out.println("Price  : " + anotherWoodenGlass.getPrice());
    }
}
