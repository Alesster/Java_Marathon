package day11.task2;

public class Paladin
        extends Hero
        implements PhysAttack, Healer {
    double physAtt;

    public Paladin() {
        health = 100;
        physDef = 50;
        magicDef = 20;
        physAtt = 15;
    }

    public void physicalAttack(Hero hero) {
        hero.health = hero.health - (int)(physAtt * (1 - hero.physDef / 100));
        if (hero.health < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        }
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
