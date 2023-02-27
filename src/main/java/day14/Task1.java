package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("numbers.txt");
        try {
            printSumDigits(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

    }

    public static void printSumDigits(File file) throws
            FileNotFoundException {
        int nsum = 0;
        Scanner scan = new Scanner(file);
        String line = scan.nextLine();
        String[] numbersString = line.split(" ");
        int n = numbersString.length;
        if(n != 10) {
            throw new RuntimeException("Некорректный входной файл");
        }
        for (String s : numbersString) {
            nsum += Integer.parseInt(s);
        }
        System.out.println(nsum);
    }
}
