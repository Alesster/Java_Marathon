package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        Motorbike motorbike = new Motorbike("Piaggio", "Blue", 2012);

        car.info();
        car.setYear(2011);
        System.out.println(car.yearDifference(2023));

        motorbike.info();
        System.out.println(motorbike.yearDifference(2023));
    }
}
