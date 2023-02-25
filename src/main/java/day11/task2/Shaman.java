package day11.task2;

public class Shaman
        extends Hero
        implements MagicAttack, Healer {
    final double SHAMAN_PHYSDEF = 20;
    final double SHAMAN_MAGICDEF = 20;
    final double SHAMAN_PHYSATT = 10;
    final double SHAMAN_MAGICATT = 15;
    double magicAtt;

    public Shaman() {
        physDef = SHAMAN_PHYSDEF;
        magicDef = SHAMAN_MAGICDEF;
        physAtt = SHAMAN_PHYSATT;
        magicAtt = SHAMAN_MAGICATT;
    }

    public void magicalAttack(Hero hero) {
        hero.health = hero.health - (int) (magicAtt * (1 - hero.magicDef / 100));
        if (hero.health < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        }
    }

    public void healHimself() {
        health += 50;
        if (health > MAX_HEALTH) {
            health = 100;
        }
    }

    public void healTeammate(Hero hero) {
        hero.health += 30;
        if (hero.health > MAX_HEALTH) {
            hero.health = 100;
        }
    }

    public String toString() {
        return "Здоровье  шамана: " + health;
    }
}


