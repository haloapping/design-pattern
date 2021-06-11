package behavioral.observer.example;

import java.util.ArrayList;

public class EmploymentAgency implements Observable {
    protected ArrayList<JobSeeker> observers = new ArrayList<>();

    public void notify(JobPost jobPost) {
        for (JobSeeker observer : this.observers) {
            observer.onJobPosted(jobPost);
        }
    }

    public void attach(JobSeeker observer) {
        this.observers.add(observer);
    }

    public void addJob(JobPost jobPost) {
        this.notify(jobPost);
    }
}
