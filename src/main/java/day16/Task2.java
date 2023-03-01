package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws
            FileNotFoundException {

        Random rnd = new Random();
        PrintWriter pw = new PrintWriter("file1.txt");
        for (int i = 0; i < 1000; i++) {
            int n = rnd.nextInt(101);
            pw.print(n + " ");
        }
        pw.close();

        File file = new File("file1.txt");
        Scanner scan = new Scanner(file);
        String[] numStr = scan.nextLine().split(" ");
        PrintWriter pw2 = new PrintWriter("file2.txt");

        for (int i = 0; i < 1000; i += 20) {
            double av_num = 0;
            for (int j = i; j < i + 20; j++) {
                av_num += Integer.parseInt(numStr[j]);
            }
            av_num = av_num / 20;
            pw2.print(av_num + " ");
        }
        pw2.close();

        File file2 = new File("file2.txt");
        printResult(file2);

    }

    public static void printResult(File file) {
        double nsum = 0;
        Scanner scan = null;
        try {
            scan = new Scanner(file);
            String[] numStr = scan.nextLine().split(" ");
            for (String num : numStr) {
                nsum += Double.parseDouble(num);
            }
            System.out.println((int) (nsum));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
