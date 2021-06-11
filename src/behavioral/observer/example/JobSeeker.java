package behavioral.observer.example;

public class JobSeeker implements Observer {
    protected String name;

    public JobSeeker(String name) {
        this.name = name;
    }

    public void onJobPosted(JobPost jobPost) {
        System.out.println("Hi " + this.name + "! New job posted: " + jobPost.getTitle());
    }
}
