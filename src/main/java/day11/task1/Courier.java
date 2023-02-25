package day11.task1;

public class Courier
        implements Worker {
    private int salary = 0;
    private boolean isPayed;
    private int countDeliveredOrders;

    Warehouse warehouse;

    public int getSalary() {
        return salary;
    }

    public boolean getIsPayed() {
        return isPayed;
    }

//    public String toString() {
//        int bonus = 0;
//        if(isPayed){
//            bonus = 50000;
//        }
//        return "Заработная плата курьера: " + salary + ", Бонус курьера: " + bonus;
//    }


    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                ", countDeliveredOrders=" + countDeliveredOrders +
                ", warehouse=" + warehouse +
                '}';
    }

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public void doWork() {
        salary += 100;
        countDeliveredOrders += 1;
        warehouse.setCountDeliveredOrders(countDeliveredOrders);
    }

    public void bonus() {
        if (!isPayed) {
            if (warehouse.getCountDeliveredOrders() >= 10000) {
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
