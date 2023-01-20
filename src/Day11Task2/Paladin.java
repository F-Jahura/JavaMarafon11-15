package Day11Task2;

public class Paladin extends Hero implements Healer{
    int cureHimself = 25;
    int cureTeammate = 10;

    public void Paladin(){
        physAtt = 15;
        physDef = 0.5;
        magicDef = 0.2;

    }

    @Override
    public void healHimself() {
        if (health + cureHimself > 100){
            health = 100;
        } else {
            health += cureHimself;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + cureTeammate > 100){
            hero.health = 100;
        } else {
            hero.health += cureTeammate;
        }

    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }
}
