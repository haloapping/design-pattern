package factorymethod.test;

public abstract class HiringManagerFactory {
    protected abstract Interviewer makeInterviewer();

    public void takeInterview() {
        Interviewer interviewer = this.makeInterviewer();
        interviewer.askQuestion();
    }
}
