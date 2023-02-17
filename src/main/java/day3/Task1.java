package day3;

/*
Реализовать программу, используя switch, которая в консоль выводит название страны, принимая на вход название города. Программа должна работать до тех пор, пока не будет введено слово “Stop”.
Реализовать, используя следующие данные:
Москва, Владивосток, Ростов - Россия
Рим, Милан, Турин - Италия
Ливерпуль, Манчестер, Лондон - Англия
Берлин, Мюнхен, Кёльн - Германия

При вводе любого другого города, вывести сообщение “Неизвестная страна”.

Пример:
Милан - ваш ввод в консоль
Италия - ответ программы
Дублин - ваш ввод в консоль
Неизвестная страна - ответ программы
Stop - ваш ввод в консоль
*программа завершила работу*

 */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner cons = new Scanner(System.in);
        String city ="";
        boolean a = true;

        while (a) {
            city = cons.nextLine();
            switch (city) {
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println("Россия");
                    break;
                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println("Италия");
                    break;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println("Англия");
                    break;
                case "Берлин":
                case "Мюнхен":
                case "Кёльн":
                    System.out.println("Германия");
                    break;
                case "Stop":
                    a = false;
                    break;
                default:
                    System.out.println("Неизвестная страна");
            }
        }

    }
}
