package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("numbers.txt");
        printResult(file);

    }

    public static void printResult(File file) {
        double nsum = 0;
        try {
            Scanner scan = new Scanner(file);
            String[] numStr = scan.nextLine().split(" ");
            for (String num : numStr) {
                nsum += Integer.parseInt(num);
            }
            double avsum = nsum / numStr.length;
            System.out.printf(avsum + " --> %,.3f", avsum);
            scan.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}

