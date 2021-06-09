package factorymethod.test;

public class Main {
    public static void main(String[] args) {
        DevelopmentManager developmentManager = new DevelopmentManager();
        System.out.print("Development Manager : ");
        developmentManager.takeInterview();

        MarketingManager marketingManager = new MarketingManager();
        System.out.print("Marketing Manager   : ");
        marketingManager.takeInterview();
    }
}
