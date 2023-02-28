package day15;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String sep = File.separator;
        String path1 = "src" + sep + "main" + sep + "resources" + sep + "shoes.csv";
        String path2 = "src" + sep + "main" + sep + "resources" + sep + "missing_shoes.txt";
        File file1 = new File(path1);
        File file2 = new File(path2);
        Scanner scan = null;
        try {
            scan = new Scanner(file1, StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.out.println("Файл не найден");
        }

        PrintWriter writer = null;
        try {
            writer = new PrintWriter(file2, StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.out.println("Что-то не так с файлом");
        }

        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            String[] numString = line.split(";");
            if (numString.length != 3 ){
                throw new RuntimeException("Некорректный входной файл");
            }
            int num = Integer.parseInt(numString[numString.length - 1]);
            if (num == 0){
                String str = numString[0] + ", " + numString[1] + ", " + numString[2];
                writer.println(str);
            }
        }

        writer.close();
        scan.close();
    }
}
