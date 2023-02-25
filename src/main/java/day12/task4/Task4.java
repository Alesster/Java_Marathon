package day12.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>(Arrays.asList("Tom Crus", "Fedor Vasechkin", "Alisa Selesneva"));
        MusicBand band1 = new MusicBand("Agata", 2019, members1);
        List<String> members2 = new ArrayList<>(Arrays.asList("John Pupkin", "Anna Petrova"));
        MusicBand band2 = new MusicBand("Kristi", 2022, members2);


//        band1.printMembers();
        System.out.println(band1.getMembers());
        System.out.println();

//        band2.printMembers();
        System.out.println(band2.getMembers());
        System.out.println();

        MusicBand.transferMembers(band1,band2);

        System.out.println("After unify");
        System.out.println();
 //       band1.printMembers();
        System.out.println(band1.getMembers());
        System.out.println();
 //       band2.printMembers();
        System.out.println(band2.getMembers());
    }
}
