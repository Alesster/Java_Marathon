package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane craft1 = new Airplane("Cessna", 1987, 7, 856 );
        Airplane craft2 = new Airplane("Piper", 1988, 8, 900 );
        Airplane.compareAirplanes(craft1, craft2);
    }
}