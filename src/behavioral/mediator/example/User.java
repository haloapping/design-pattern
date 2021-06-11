package behavioral.mediator.example;

public class User {
    private String name;
    private ChatRoomMediator chatRoomMediator;

    public User(String name, ChatRoomMediator chatRoomMediator) {
        this.name = name;
        this.chatRoomMediator = chatRoomMediator;
    }

    public String getName() {
        return this.name;
    }

    public void send(String message) {
        this.chatRoomMediator.showMessage(this, message);
    }
}
