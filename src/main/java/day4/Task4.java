package day4;

/*
Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
Найти максимум среди сумм трех соседних элементов. Для найденной тройки с максимальной суммой выведите значение суммы и индекс первого элемента тройки.

Пример:
*Для простоты пример показан на массиве размера 10

[1, 456, 1025, 65, 954, 2789, 4, 8742, 1040, 3254]

Тройка с максимальной суммой: [8742, 1040, 3254]

Вывод в консоль:
13036
7
*/

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int max = Integer.MIN_VALUE;
        int n = 100, m = 10001, sum, index = 0;

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rnd.nextInt(m);
        }

//        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length - 2; i++) {
            sum = 0;
            for (int j = i; j < i + 3; j++) {
                sum += arr[j];
            }
//            System.out.println("index: " + i + ", sum: " + sum);
            if (sum >= max) {
                max = sum;
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index);

    }
}
