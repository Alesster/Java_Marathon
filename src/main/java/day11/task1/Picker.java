package day11.task1;

public class Picker
        implements Worker {
    private int salary = 0;
    private boolean isPayed;
    private int countPickedOrders;

    public int getSalary() {
        return salary;
    }

    public boolean getIsPayed() {
        return isPayed;
    }

    public String toString() {
        int bonus = 0;
        if(isPayed){
            bonus = 70000;
        }
        return "Заработная плата сборщика: " + salary + ", Бонус сборщика: " + bonus;
    }

    public Picker(Warehouse warehouse) {}

    public void doWork() {
        salary += 80;
        countPickedOrders += 1;
        Warehouse.setCountPickedOrders(countPickedOrders);
    }

    public void bonus() {
        if (!isPayed) {
            if (Warehouse.getCountPickedOrders() >= 10000) {
                salary += 70000;
            } else {
                System.out.println("Бонус пока не доступен");
            }
            isPayed = true;
        } else {
            System.out.println("Бонус уже был выплачен");
        }
    }
}
