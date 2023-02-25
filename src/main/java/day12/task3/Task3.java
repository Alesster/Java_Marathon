package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> list = new ArrayList<>();
        list.add(new MusicBand("Ataman", 1976));
        list.add(new MusicBand("Pupkin", 2001));
        list.add(new MusicBand("Mama Mia", 1982));
        list.add(new MusicBand("Masha", 2005));
        list.add(new MusicBand("Pasha", 1996));
        list.add(new MusicBand("Galaxy", 1992));
        list.add(new MusicBand("Milky Way", 2009));
        list.add(new MusicBand("Pesnyary", 2013));
        list.add(new MusicBand("From the Sky", 1978));
        list.add(new MusicBand("Andromeda", 2022));

        Collections.shuffle(list);

        for (MusicBand band : list) {
            System.out.println(band.name);
        }

        System.out.println();

        for (MusicBand band : groupsAfter2000(list)) {
            System.out.println(band.name);
        }

    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        List<MusicBand> newbands = new ArrayList<>();
        for (MusicBand band : bands) {
            if(band.year >= 2000){
                newbands.add(band);
            }
        }
        return newbands;
    }
}
