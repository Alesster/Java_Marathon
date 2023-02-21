package day8;

public class Task2 {
    public static void main(String[] args) {
        Airplane craft = new Airplane("Robin", 2005, 7, 924);
        craft.setManufacturer("Beechcraft");
        craft.setYear(1990);
        craft.setLength(8);
        craft.setWeight(1200);
        craft.fillUp(100);
        System.out.println(craft);
        craft.info();
    }
}
