package day1;

/*
Объявите переменную типа int, имя переменной - k. Присвойте этой переменной какую-нибудь цифру от 1 до 9. Используя цикл на ваше усмотрение (for или while), выведите в консоль таблицу умножения для этой цифры в следующем формате:
1 x k = …
2 x k = …
3 x k = …
……
9 x k = …

 */

public class Task6 {
    public static void main(String[] args) {
        int k = 9;
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d x %d = %d \n", i, k, i * k);
        }
    }
}
