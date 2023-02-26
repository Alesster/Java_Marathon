package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User> subscriptions;

    public User(String username){
        this.username = username;
        subscriptions = new ArrayList<>();
    }

    public String getUser() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User user){
        subscriptions.add(user);
    }

    public boolean isSubscribed(User user){
        return subscriptions.contains(user);
    }

    public boolean isFriend(User user){
        return User.this.isSubscribed(user) && user.isSubscribed(User.this);
    }

    public void sendMessage(User user, String text){
        MessageDatabase.addNewMessage(User.this, user, text);
    }

    public String toString(){
        return username;
    }
}
