package Day11Task2;

public abstract class Hero implements PhysAttack {
    int health;
    int physAtt;
    int magicAtt;
    double physDef;
    double magicDef;

    public void Hero(){
        health = 100;
    }


    @Override
    public void physicalAttack(Hero hero) {
        double physicHit = hero.physAtt * (1 - hero.physDef);
        if (hero.health - physicHit < 0){
            hero.health = 0;
        } else {
            hero.health -= physicHit;
        }
    }

    @Override
    public String toString() {
        return "Hero{" +
                "health=" + health +
                '}';
    }
}
