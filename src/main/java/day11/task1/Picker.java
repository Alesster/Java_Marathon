package day11.task1;

public class Picker
        implements Worker {
    private int salary = 0;
    private boolean isPayed;
    private int countPickedOrders;
    Warehouse warehouse;

    public int getSalary() {
        return salary;
    }

    public boolean getIsPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                ", countPickedOrders=" + countPickedOrders +
                ", warehouse=" + warehouse +
                '}';
    }

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public void doWork() {
        salary += 80;
        countPickedOrders += 1;
        warehouse.setCountPickedOrders(countPickedOrders);
    }

    public void bonus() {
        if (!isPayed) {
            if (warehouse.getCountPickedOrders() >= 10000) {
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
