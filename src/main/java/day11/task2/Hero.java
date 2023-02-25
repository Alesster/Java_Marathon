package day11.task2;

public abstract class Hero implements PhysAttack{
    int health = 100;
    double physDef;
    double magicDef;
    double physAtt;

    final int MAX_HEALTH = 100;
    final int MIN_HEALTH = 0;

    public void physicalAttack(Hero hero) {
        hero.health = (int)(hero.health - (physAtt * (1 - hero.physDef / 100)));
        if (hero.health < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        }
    }
}
