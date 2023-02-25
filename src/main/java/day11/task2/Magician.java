package day11.task2;

public class Magician
        extends Hero
        implements MagicAttack {
    final double MAGICIAN_PHYSDEF = 0;
    final double MAGICIAN_MAGICDEF = 80;
    final double MAGICIAN_PHYSATT = 5;
    final double MAGICIAN_MAGICATT = 20;
    double magicAtt;

    public Magician() {
        physDef = MAGICIAN_PHYSDEF;
        magicDef = MAGICIAN_MAGICDEF;
        physAtt = MAGICIAN_PHYSATT;
        magicAtt = MAGICIAN_MAGICATT;
    }

    public void magicalAttack(Hero hero) {
        hero.health = hero.health - (int) (magicAtt * (1 - hero.magicDef / 100));
        if (hero.health < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        }
    }

    public String toString() {
        return "Здоровье  мага: " + health;
    }
}
