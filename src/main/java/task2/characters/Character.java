package task2.characters;

public abstract class Character {
    protected String name;

    public Character(String name) {
        this.name = name;
    }

    public abstract String getDescription();
}
