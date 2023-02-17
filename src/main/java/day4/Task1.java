package day4;

/*
С клавиатуры вводится число n - размер массива. Необходимо создать массив указанного размера и заполнить его случайными числами от 0 до 10 (включительно). Используя цикл for each вывести содержимое массива в консоль, а также вывести в консоль информацию о:
а) Длине массива
б) Количестве чисел больше 8
в) Количестве чисел равных 1
г) Количестве четных чисел
д) Количестве нечетных чисел
е) Сумме всех элементов массива

Пример:
Введено число 10. Сгенерирован следующий массив:
[4, 8, 4, 9, 5, 2, 2, 3, 3, 6]

Информация о массиве:
Длина массива: 10
Количество чисел больше 8: 1
Количество чисел равных 1: 0
Количество четных чисел: 6
Количество нечетных чисел: 4
Сумма всех элементов массива: 46

 */

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner cons = new Scanner(System.in);
        int n = cons.nextInt();
        int num8=0, num1=0, even=0, odd=0, sum=0;

        int[] arr = new int[n];
        for (int i = 0; i < n ; i++)
            arr[i] = rnd.nextInt(11);

        for (int val: arr) {
            System.out.print(val + " ");
            sum +=val;
            if(val > 8){
                num8++;
            } else if (val == 1) {
                num1++;
            }
            if(val%2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println();
        System.out.printf("Длина массива: %d\n", arr.length);
        System.out.printf("Количество чисел больше 8: %d\n", num8);
        System.out.printf("Количество чисел равных 1: %d\n", num1);
        System.out.printf("Количество четных чисел: %d\n", even);
        System.out.printf("Количество нечетных чисел: %d\n", odd);
        System.out.printf("Сумма всех элементов массива: %d\n", sum);

    }
}
