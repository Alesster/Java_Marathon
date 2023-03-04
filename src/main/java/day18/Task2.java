package day18;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(count7(717771237));
    }

    public static int count7(int n) {
        int count = 0;
        if (n == 0) return 0;
        if (n % 10 == 7) count++;
        return count + count7(n / 10);
    }
}