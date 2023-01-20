package Day11Task2;

public class Magician extends Hero implements MagicAttack{

    public void Magician(){
        physAtt = 5;
        magicDef = 0.8;
        magicAtt = 20;
    }

    @Override
    public void magicalAttack(Hero hero) {
        double magicHit = hero.magicAtt * (1 - hero.magicDef);
        if (hero.health - magicHit < 0){
            hero.health = 0;
        } else {
            hero.health -= magicHit;
        }
    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                '}';
    }
}
