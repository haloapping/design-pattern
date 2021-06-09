package creational.factorymethod.test;

public class DevelopmentManager extends HiringManagerFactory {
    @Override
    protected Interviewer makeInterviewer() {
        return new Developer();
    }
}
