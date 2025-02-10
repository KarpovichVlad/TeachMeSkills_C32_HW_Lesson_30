package task2.terrain;

public class Forest extends Terrain {
    public Forest() {
        super("Лес");
    }

    @Override
    public String getDescription() {
        return "густом лесу с высокими деревьями и разнообразной флорой";
    }
}
