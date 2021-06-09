package creational.factorymethod.example;

public class DevelopmentManager extends HiringManagerFactory {
    @Override
    protected Interviewer makeInterviewer() {
        return new Developer();
    }
}
