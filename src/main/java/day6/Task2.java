package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane aircraft = new Airplane("Cessna", 1987, 7, 856 );
        aircraft.setYear(1990);
        aircraft.setLength(8);
        aircraft.fillUp(100);
        aircraft.fillUp(400);
        aircraft.info();
    }
}
