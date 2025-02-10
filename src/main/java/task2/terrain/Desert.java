package task2.terrain;

public class Desert extends Terrain {
    public Desert() {
        super("Пустыня");
    }

    @Override
    public String getDescription() {
        return "жаркой пустыне с песчаными дюнами и редкими растениями";
    }
}
