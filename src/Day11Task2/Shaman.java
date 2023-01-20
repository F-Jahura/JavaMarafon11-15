package Day11Task2;

public class Shaman extends Hero implements MagicAttack, Healer {
    int cureHimself = 50;
    int cureTeammate = 30;

    public void Shaman() {
        physAtt = 10;
        physDef = 0.2;
        magicAtt = 15;
        magicDef = 0.2;
    }

    @Override
    public void healHimself() {
        if (health + cureHimself > 100) {
            health = 100;
        } else {
            health += cureHimself;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + cureTeammate > 100) {
            hero.health = 100;
        } else {
            hero.health += cureTeammate;
        }
    }

    @Override
    public void magicalAttack(Hero hero) {
        double magicHit = hero.magicAtt * (1 - hero.magicDef);
        if (hero.health - magicHit < 0) {
            hero.health = 0;
        } else {
            hero.health -= magicHit;
        }
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}