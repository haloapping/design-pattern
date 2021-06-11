package behavioral.mediator.example;

public class Main {
    public static void main(String[] args) {
        ChatRoom mediator = new ChatRoom();

        User john = new User("John Doe", mediator);
        User jane = new User("Jane Doe", mediator);

        john.send("Hi Jane");
        jane.send("Hey!");
    }
}
