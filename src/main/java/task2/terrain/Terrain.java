package task2.terrain;

public abstract class Terrain {
    protected String name;

    public Terrain(String name) {
        this.name = name;
    }
    public abstract String getDescription();
}
