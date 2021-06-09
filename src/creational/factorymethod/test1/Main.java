package creational.factorymethod.test1;

public class Main {
    public static void main(String[] args) {
        CarpenterManager carpenterManager = new CarpenterManager();
        carpenterManager.takeArtisan();

        BlackSmithManager blackSmithManager = new BlackSmithManager();
        blackSmithManager.takeArtisan();
    }
}
