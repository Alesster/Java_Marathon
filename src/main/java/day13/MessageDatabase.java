package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    static List<Message> messages = new ArrayList<>();

    public static void addNewMessage(User u1, User u2, String text) {
        Message sms = new Message(u1, u2, text);
        messages.add(sms);
    }

    public static List<Message> getMessages() {
        return messages;
    }

    public static void showDialog(User u1, User u2) {
        for (Message message : messages) {
            if (message.getSender().getUser().equals(u1.getUser()) && message.getReceiver().getUser().equals(u2.getUser())) {
                System.out.println(u1.getUser() + ": " + message.getText());
            } else if (message.getSender().getUser().equals(u2.getUser()) && message.getReceiver().getUser().equals(u1.getUser())) {
                System.out.println(u2.getUser() + ": " + message.getText());
            }
        }
    }
}
