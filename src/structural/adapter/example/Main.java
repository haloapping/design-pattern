package structural.adapter.example;

public class Main {
    public static void main(String[] args) {
        AfricanLion africanLion = new AfricanLion();
        AsianLion asianLion = new AsianLion();
        WildDog wildDog = new WildDog();
        WildDogAdapter wildDogAdapter = new WildDogAdapter(wildDog);

        Hunter hunter = new Hunter();

        hunter.hunt(africanLion);
        hunter.hunt(asianLion);
        hunter.hunt(wildDogAdapter);
    }
}
