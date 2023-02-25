package day12.task4;

import java.util.List;

public class MusicBand {
    String name;
    int year;
    List<String> members;

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public static void transferMembers(MusicBand band1, MusicBand band2) {
        for (String band : band1.members) {
            band2.members.add(band);
            //Collections.addAll(band2.members, band);
        }
        band1.members.clear();
    }

    public void printMembers() {
        System.out.println("Members of Music band: " + name);
        for (String member : members) {
            System.out.println(member);
        }
    }

    public List<String> getMembers() {
        System.out.println("Members of Music band: " + name);
        return members;
    }
}
