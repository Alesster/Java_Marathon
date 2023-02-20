package day7;

public class Player {
    private int stamina;
    public final int MAX_STAMINA = 100;
    public final int MIN_STAMINA = 0;
    public static int countPlayers;

    public Player(int stamina) {
        if ((stamina >= MIN_STAMINA) && (stamina <= MAX_STAMINA)) {
            this.stamina = stamina;
        } else {
            System.out.println("Error: Stamina out of range");
        }
        countPlayers++;
        if (countPlayers > 6) countPlayers = 6;
    }

    public int getStamina() {
        return this.stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run() {
        if (this.stamina > MIN_STAMINA) {
            this.stamina--;
            if (this.stamina == MIN_STAMINA) {
                countPlayers--;
            }
        }
    }

    public static void info() {
        if (countPlayers == 6) {
            System.out.println("На поле нет свободных мест");
        } else if (countPlayers == 5) {
            System.out.printf("Команды неполные. На поле ещё есть 1-но свободное место\n");
        } else if(countPlayers > 1){
            System.out.printf("Команды неполные. На поле ещё есть %d свободных места\n", 6 - countPlayers);
        } else{
            System.out.printf("Команды неполные. На поле ещё есть %d свободных мест\n", 6 - countPlayers);
        }
    }
}

