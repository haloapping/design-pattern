package behavioral.observer.example;

public class Main {
    public static void main(String[] args) {
        JobSeeker johnDoe = new JobSeeker("John Doe");
        JobSeeker janeDoe = new JobSeeker("Jane Doe");

        EmploymentAgency jobPostings = new EmploymentAgency();
        jobPostings.attach(johnDoe);
        jobPostings.attach(janeDoe);

        jobPostings.addJob(new JobPost("Software Engineer"));
    }
}
