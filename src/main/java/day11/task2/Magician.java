package day11.task2;

public class Magician
        extends Hero
        implements PhysAttack, MagicAttack {
     double physAtt;
     double magicAtt;

    public Magician() {
        health = 100;
        physDef = 0;
        magicDef = 80;
        physAtt = 5;
        magicAtt = 20;
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

    public String toString() {
        return "Здоровье  мага: " + health;
    }
}
