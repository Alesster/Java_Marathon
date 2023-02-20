package day7;

public class Airplane {
    private String manufacturer;
    private int year;
    private  int length;
    private int weight;
    private int fuel;

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel(){
        return this.fuel;
    }

    public Airplane(String manufacturer, int year, int length, int weight ){
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void info(){
        System.out.print("Изготовитель: " + this.manufacturer);
        System.out.print(", год выпуска: " + this.year) ;
        System.out.print(", длина: " + this.length);
        System.out.print(", вес: " + this.weight);
        System.out.println(", количество топлива в баке: " + fuel);
    }

    public void fillUp(int n){
        this.fuel += n;
    }

    public static void compareAirplanes(Airplane craft1, Airplane craft2){
        if (craft1.length > craft2.length){
            System.out.println("Первый самолет длиннее");
        }else if(craft1.length < craft2.length){
            System.out.println("Второй самолет длиннее");;
        }else {
            System.out.println("Длины самолетов равны");
        }

    }
}
