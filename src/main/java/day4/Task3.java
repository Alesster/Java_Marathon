package day4;

/*Заполнить двумерный массив (матрицу) случайными числами от 0 до 50. Размер матрицы задать m=12, n=8 (m - размерность по строкам, n - размерность по колонкам). В консоль вывести индекс строки, сумма чисел в которой максимальна. Если таких строк несколько, вывести индекс последней из них.
        Пример сгенерированной матрицы (для простоты m=3, n=5):

        3 2 1 5 7 	// сумма - 18
        1 2 5 6 2 	// сумма - 16
        3 4 9 6 4	// сумма - 26

Ответ: 2 (индекс строки, сумма чисел в которой максимальна)
*/

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int max = Integer.MIN_VALUE;
        int m = 12, n = 8, sum, index = 0;
        int[][] data = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                data[i][j] = rnd.nextInt(51);
            }
        }

//        System.out.println(Arrays.deepToString(data));

        for (int i = 0; i < m; i++) {
            sum = 0;
            for (int val : data[i]) {
                sum += val;
            }
//            System.out.println("index: " + i + ", sum: " + sum);
            if (sum >= max) {
                max = sum;
                index = i;
            }

        }
        System.out.println(index);

    }
}
