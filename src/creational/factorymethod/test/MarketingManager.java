package creational.factorymethod.test;

public class MarketingManager extends HiringManagerFactory {
    @Override
    protected Interviewer makeInterviewer() {
        return new CommunityExecutive();
    }
}
