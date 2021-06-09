package creational.factorymethod.test;

public class Developer implements Interviewer {
    @Override
    public void askQuestion() {
        System.out.println("Ask design patterns!");
    }
}
