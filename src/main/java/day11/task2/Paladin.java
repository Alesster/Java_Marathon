package day11.task2;

public class Paladin
        extends Hero
        implements Healer {
    final double PALADIN_PHYSDEF = 50;
    final double PALADIN_MAGICDEF = 20;
    final double PALADIN_PHYSATT = 15;

    public Paladin() {
        physDef = PALADIN_PHYSDEF;
        magicDef = PALADIN_MAGICDEF;
        physAtt = PALADIN_PHYSATT;
    }

    public void healHimself() {
        health += 25;
        if (health > MAX_HEALTH) {
            health = 100;
        }
    }

    public void healTeammate(Hero hero) {
        hero.health += 10;
        if (hero.health > MAX_HEALTH) {
            hero.health = 100;
        }
    }

    public String toString() {
        return "Здоровье паладина: " + health;
    }
}
