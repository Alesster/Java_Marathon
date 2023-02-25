package day11.task1;

public class Courier
        implements Worker {
    private int salary = 0;
    private boolean isPayed;
    private int countDeliveredOrders;

    public int getSalary() {
        return salary;
    }

    public boolean getIsPayed() {
        return isPayed;
    }

    public String toString() {
        int bonus = 0;
        if(isPayed){
            bonus = 50000;
        }
        return "Заработная плата курьера: " + salary + ", Бонус курьера: " + bonus;
    }

    public Courier(Warehouse warehouse) {}

    public void doWork() {
        salary += 100;
        countDeliveredOrders += 1;
        Warehouse.setCountDeliveredOrders(countDeliveredOrders);
    }

    public void bonus() {
        if (!isPayed) {
            if (Warehouse.getCountDeliveredOrders() >= 10000) {
                salary += 50000;
            } else {
                System.out.println("Бонус пока не доступен");
            }
            isPayed = true;
        } else {
            System.out.println("Бонус уже был выплачен");
        }
    }
}
