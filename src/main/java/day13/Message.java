package day13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Message {
    private User sender;
    private User receiver;
    private String text;
    Date date;

    public Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }

    public Date getDate() {
        return date;
    }

    public String toString(){
        date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("E MMMM d HH:mm:ss Z yyyy");
        String sms = dateFormat.format(date.getTime());
        return "FROM: " + sender.getUser() + "\n" +
                "TO: " + receiver.getUser() + "\n" +
                "ON: " + sms + "\n" +
                text + "\n";
    }
}
