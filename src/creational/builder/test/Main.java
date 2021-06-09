package creational.builder.test;

public class Main {
    public static void main(String[] args) {
        NasiPadang nasiPadang15K = new NasiPadangBuilder(1).addChicken(1).wrap();

        System.out.println("Komposisi nasi padang 15K: ");
        System.out.println("Rice size         : " + nasiPadang15K.getRiceSize());
        System.out.println("Number of chicken : " + nasiPadang15K.getNumberOfChickenRendang());
        System.out.println("Sauce             : " + nasiPadang15K.isSauce());
        System.out.println("Spicy sauce       : " + nasiPadang15K.isSpicySauce());
        System.out.println("Vegetable         : " + nasiPadang15K.isVegetable());
    }
}
