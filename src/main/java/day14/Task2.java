package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("people.txt");
        try {
            System.out.println(parseFileToStringList(file));
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }

    public static List<String> parseFileToStringList(File file) throws
            FileNotFoundException {
        List<String> peopleList = new ArrayList<>();
        Scanner scan = new Scanner(file);
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            String[] numbersString = line.split(" ");
            int age = Integer.parseInt(numbersString[numbersString.length - 1]);
            if (age < 0) {
                throw new RuntimeException("Некорректный входной файл");
            }
            peopleList.add(line);
        }

        return peopleList;
    }
}
