package day18;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(count7(717771737));
    }

    public static int count7(int n) {
        if (n == 0) return 0;

        if (n % 10 == 7)
            return 1 + count7(n / 10);
        else
            return count7(n / 10);
    }
}