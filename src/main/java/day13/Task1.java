package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Ким");
        User user2 = new User("Брахман");
        User user3 = new User("Наташа");

        user1.sendMessage(user2, "Привет, Брахман.");
        user1.sendMessage(user2, "Как дела?");
        user2.sendMessage(user1,"Привет, Ким! Отлично!");
        user2.sendMessage(user1,"Как твоё ничего?");
        user2.sendMessage(user1,"Как съездил в отпуск?");
        user3.sendMessage(user1,"Ким, привет!");
        user3.sendMessage(user1,"Давно тебя не видела.");
        user3.sendMessage(user1,"Давай встретимся.");
        user1.sendMessage(user3, "Привет, Наташа!");
        user1.sendMessage(user3, "Давай не будем встречаться.");
        user1.sendMessage(user3, "Я нашёл другую.");
        user3.sendMessage(user1,"Ну и козёл, блин! Ёханый бабай!");




    //    System.out.println(MessageDatabase.getMessages());
        MessageDatabase.showDialog(user1, user3);

//        user1.subscribe(user2);
//        System.out.println(user1.isSubscribed(user2));
//        user2.subscribe(user1);
//        System.out.println(user2.isSubscribed(user1));
//        System.out.println(user1.isFriend(user2));

    }
}
