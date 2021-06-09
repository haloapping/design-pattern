package creational.prototype.example;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep firstSheep = new Sheep("Jolly", "Mountain Sheep");
        System.out.println("Name     : " + firstSheep.getName());
        System.out.println("Category : " + firstSheep.getCategory());

        Sheep secondSheep = (Sheep)firstSheep.clone();
        System.out.println("Name     : " + secondSheep.getName());
        System.out.println("Category : " + secondSheep.getCategory());

        System.out.println(firstSheep.hashCode());
        System.out.println(secondSheep.hashCode());
    }
}
