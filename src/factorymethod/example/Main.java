package factorymethod.example;

public class Main {
    public static void main(String[] args) {
        DevelopmentManager developmentManager = new DevelopmentManager();
        developmentManager.takeInterviewer();

        MarketingManager marketingManager = new MarketingManager();
        marketingManager.takeInterviewer();
    }
}
