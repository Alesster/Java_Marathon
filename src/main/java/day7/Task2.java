package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rnd = new Random();
       // int staminta0 = rnd.nextInt(11)+90;

        Player pl1 = new Player(rnd.nextInt(11)+90);
        Player pl2 = new Player(rnd.nextInt(11)+90);
        Player pl3 = new Player(rnd.nextInt(11)+90);
        Player pl4 = new Player(rnd.nextInt(11)+90);
        Player pl5 = new Player(rnd.nextInt(11)+90);
        Player pl6 = new Player(rnd.nextInt(11)+90);
//        Player pl7 = new Player(rnd.nextInt(11)+90);
//        Player pl8 = new Player(rnd.nextInt(11)+90);

        System.out.println("Players: " + Player.getCountPlayers());
        System.out.println("Stamina of player 2: " + pl2.getStamina());
        Player.info();
        System.out.println("***************");
        for (int i = 1; i <= 100; i++) {
            pl2.run();
        }
        Player.info();
        System.out.println("Players: " + Player.getCountPlayers());
        System.out.println("Stamina of player 2: " + pl2.getStamina());

    }
}
