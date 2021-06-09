package creational.singleton.example;

public class Main {
    public static void main(String[] args) {
        President firstPresident = President.getInstance();
        President secondPresident = President.getInstance();
        President fifthPresident = President.getInstance();
        President sixthPresident = President.getInstance();
        President thirdPresident = new President();
        President fourthPresident = new President();

        System.out.println(firstPresident.equals(thirdPresident));
        System.out.println(firstPresident.equals(secondPresident));
        System.out.println(thirdPresident.equals(fourthPresident));
        System.out.println(fifthPresident.equals(sixthPresident));
    }
}
