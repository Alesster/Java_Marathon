package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("people.txt");
        try {
            System.out.println(parseFileToObjList(file));
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }

    public static List<Human> parseFileToObjList(File file) throws
            FileNotFoundException {
        List<Human> peopleList = new ArrayList<>();
        Scanner scan = new Scanner(file);
        while (scan.hasNextLine()) {
            String[] numbersString = scan.nextLine().split(" ");
            int age = Integer.parseInt(numbersString[numbersString.length - 1]);
            if (age < 0) {
                throw new RuntimeException("Некорректный входной файл");
            }
            peopleList.add(new Human(numbersString[0], age));
        }

        return peopleList;
    }
}
