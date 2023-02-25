package day11.task2;

public class Warrior
        extends Hero
        implements PhysAttack {
    double physAtt;

    public Warrior() {
        health = 100;
        physDef = 80;
        magicDef = 0;
        physAtt = 30;
    }

    public void physicalAttack(Hero hero) {
        hero.health = hero.health - (int) (physAtt * (1 - hero.physDef / 100));
        if (hero.health < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        }
    }

    public String toString() {
        return "Здоровье воина: " + health;
    }
}
