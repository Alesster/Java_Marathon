package day11.task2;

public class Shaman
        extends Hero
        implements PhysAttack, MagicAttack, Healer {
     double physAtt;
     double magicAtt;

    public Shaman() {
        health = 100;
        physDef = 20;
        magicDef = 20;
        physAtt = 10;
        magicAtt = 15;
    }

    public void physicalAttack(Hero hero) {
        hero.health = hero.health - (int)(physAtt * (1 - hero.physDef / 100));
        if (hero.health < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        }
    }

    public void magicalAttack(Hero hero) {
        hero.health = hero.health - (int)(magicAtt * (1 - hero.magicDef / 100));
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


