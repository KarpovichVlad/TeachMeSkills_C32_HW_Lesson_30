package task2.factories;

import task2.terrain.Desert;
import task2.terrain.Terrain;

public class DesertFactory implements TerrainFactory{
    @Override
    public Terrain createTerrain() {
        return new Desert();
    }
}
