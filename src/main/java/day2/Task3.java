package day2;

/*
Реализовать программу №2, используя цикл while.
 */

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner cons = new Scanner(System.in);
        int num1 = cons.nextInt();
        int num2 = cons.nextInt();
//        boolean b = true;

        if(num1 >= num2) {
            System.out.println("Некорректный ввод");
        }else{
            num1++;
            while ( num1 < num2 ) {
//                num1++;
                if (num1%5 == 0 && num1%10 != 0){
                    System.out.print(num1 + " ");
                }
                num1++;
//                if (num1 == num2-1) b = false;
            }
        }
    }
}
