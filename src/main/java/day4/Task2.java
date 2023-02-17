package day4;

/*
Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
Затем, используя цикл for each вывести в консоль:
наибольший элемент массива
наименьший элемент массива
количество элементов массива, оканчивающихся на 0
сумму элементов массива, оканчивающихся на 0

Использовать сортировку запрещено.

 */

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int nval0=0, sumval0=0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int[] arr = new int[100];
        for (int i = 0; i < 100 ; i++)
            arr[i] = rnd.nextInt(10001);

//        System.out.println(Arrays.toString(arr));

        for (int val: arr){
            if(val > max) max = val;
            if(val < min) min = val;
            if (val%10 == 0){
                nval0 ++;
                sumval0 += val;
            }
        }
        System.out.println("наибольший элемент массива: " + max);
        System.out.println("наименьший элемент массива: " + min);
        System.out.println("количество элементов массива, оканчивающихся на 0: " + nval0);
        System.out.println("сумма элементов массива, оканчивающихся на 0: " + sumval0);
    }
}
