package day13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Message {
    private User sender;
    private User receiver;
    private String text;
    private Date date;

    private final SimpleDateFormat dateFormat =new SimpleDateFormat("E MMMM d HH:mm:ss Z yyyy");

    public Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        date = new Date();
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
//        date = new Date();
//        SimpleDateFormat dateFormat = new SimpleDateFormat("E MMMM d HH:mm:ss Z yyyy");
//        String sms = dateFormat.format(date.getTime());
        return "FROM: " + sender.getUser() + "\n" +
                "TO: " + receiver.getUser() + "\n" +
                "ON: " + dateFormat.format(date.getTime()) + "\n" +
                text + "\n";
    }
}
