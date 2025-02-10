package task2.factories;

import task2.terrain.Forest;
import task2.terrain.Terrain;

public class ForestFactory implements TerrainFactory{
    @Override
    public Terrain createTerrain() {
        return new Forest();
    }
}
