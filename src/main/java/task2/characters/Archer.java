package task2.characters;

public class Archer extends Character {
    public Archer() {
        super("Стрелок");
    }


    @Override
    public String getDescription() {
        return "с луком и колчаном стрел";
    }
}
