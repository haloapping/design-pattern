package factorymethod.test;

public class CommunityExecutive implements Interviewer {
    @Override
    public void askQuestion() {
        System.out.println("Ask community executive!");
    }
}