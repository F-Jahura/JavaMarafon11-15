package Day11Task2;

public class Warrior extends Hero{
    public void Warrior(){
        physAtt = 30;
        physDef = 0.8;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + health +
                '}';
    }
}
