package day12.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        MusicArtist artist1 = new MusicArtist("John Moon", 34);
        MusicArtist artist2 = new MusicArtist("Olga Nuland", 87);
        MusicArtist artist3 = new MusicArtist("Sabrina Crowl", 14);
        List<MusicArtist> members1 = new ArrayList<>(Arrays.asList(artist1,artist2));
        List<MusicArtist> members2 = new ArrayList<>(Arrays.asList(artist3));
        MusicBand band1 = new MusicBand("Agata", 2019, members1);
        MusicBand band2 = new MusicBand("Kristi", 2022, members2);

     //   band1.printMembers();
        System.out.println(band1.getMembers());
        System.out.println();
     //   band2.printMembers();
        System.out.println(band2.getMembers());

        MusicBand.transferMembers(band1, band2);
        System.out.println("After unify");
        System.out.println();

    //    band1.printMembers();
        System.out.println(band1.getMembers());
        System.out.println();
    //    band2.printMembers();
        System.out.println(band2.getMembers());

    }
}
