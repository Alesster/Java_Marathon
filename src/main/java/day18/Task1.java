package day18;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        //  int[] numbers = {1, 1, 1, 1};
        System.out.println(recursionSum(numbers, 0));
    }

    public static int recursionSum(int[] arr, int n) {
        if (n == arr.length - 1) return arr[arr.length - 1];
        return arr[n] + recursionSum(arr, n + 1);
    }
}
