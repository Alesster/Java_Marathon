package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        listFill(0, 30, list);
        System.out.println(list);

        listFill(300, 500, list);
        System.out.println(list);

    }

    public static void listFill(int a, int b, List list){
        for (int i = a; i <= b; i++) {
            if(i%2 == 0){
                list.add(i);
            }
        }
    }
}
