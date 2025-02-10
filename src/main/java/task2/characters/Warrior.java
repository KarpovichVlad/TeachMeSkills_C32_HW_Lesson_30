package task2.characters;

public class Warrior extends Character {
    public Warrior() {
        super("Воин");
    }


    @Override
    public String getDescription() {
        return "с тяжелым мечом и бронированной броней";
    }
}
