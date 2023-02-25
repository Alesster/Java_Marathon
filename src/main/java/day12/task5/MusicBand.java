package day12.task5;

import java.util.Collections;
import java.util.List;

public class MusicBand {
    String name;
    int year;
    //MusicArtist members;
    List<MusicArtist> members;

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public static void transferMembers(MusicBand band1, MusicBand band2) {
        for (MusicArtist band : band1.members) {
            //band2.members.add(band);
            Collections.addAll(band2.members, band);
        }
        band1.members.clear();
    }

    public void printMembers() {
        System.out.println("Members of Music band: " + name);
        for (MusicArtist member : members) {
            System.out.println(member);
        }
    }

    public List<MusicArtist> getMembers() {
        System.out.println("Members of Music band: " + name);
        return members;
    }
}
