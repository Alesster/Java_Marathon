package day11.task1;

public class Warehouse {
    private static int countPickedOrders;
    private static int countDeliveredOrders;

    public static int getCountPickedOrders() {
        return countPickedOrders;
    }

    public static void setCountPickedOrders(int count) {
        countPickedOrders = count;
    }

    public static int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public static void setCountDeliveredOrders(int count) {
        countDeliveredOrders = count;
    }

    public String toString() {
        return "Количество собранных заказов: " + countPickedOrders + ", Количество доставленных заказов: " + countDeliveredOrders;
    }
}
