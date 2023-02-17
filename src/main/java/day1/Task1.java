package day1;
/*
Вывести на экран слово “JAVA”, в строку, чтобы оно повторилось 10 раз, используя цикл while.
Вывод в консоль должен быть таким:
JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA
 */
public class Task1 {
    public static void main(String[] args) {
        int n = 0;
        while (n < 10) {
            System.out.print("JAVA ");
            n++;
        }
    }
}
