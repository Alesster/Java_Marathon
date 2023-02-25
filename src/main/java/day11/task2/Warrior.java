package day11.task2;

public class Warrior
        extends Hero {
    final double WARRIOR_PHYSDEF = 80;
    final double WARRIOR_MAGICDEF = 0;
    final double WARRIOR_PHYSATT = 30;

    public Warrior() {
        physDef = WARRIOR_PHYSDEF;
        magicDef = WARRIOR_MAGICDEF;
        physAtt = WARRIOR_PHYSATT;
    }

    public String toString() {
        return "Здоровье воина: " + health;
    }
}
