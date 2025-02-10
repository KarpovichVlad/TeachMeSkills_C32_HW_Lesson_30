package task2.terrain;

public class City extends Terrain{
    public City() {
        super("Город");
    }

    @Override
    public String getDescription() {
        return "многолюдным городе с высокими зданиями и шумными улицами";
    }
}
