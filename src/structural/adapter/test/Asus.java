package structural.adapter.test;

public class Asus implements Laptop {
    @Override
    public void chargingWithTwoLeggedPlug() {
        System.out.println("Lenovo charging with two plug");
    }
}
