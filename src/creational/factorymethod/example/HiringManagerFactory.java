package creational.factorymethod.example;

public abstract class HiringManagerFactory {
    protected abstract Interviewer makeInterviewer();

    public void takeInterviewer() {
        Interviewer interviewer = this.makeInterviewer();
        interviewer.askQuestions();
    }
}
