package behavioral.mediator.example;

import java.util.Date;

public class ChatRoom implements ChatRoomMediator{
    @Override
    public void showMessage(User user, String message) {
        Date time = new Date();
        String sender = user.getName();

        System.out.println(time + "[" + sender + "]: " + message);
    }
}
