package task2.factories;

import task2.terrain.City;
import task2.terrain.Terrain;

public class CityFactory implements TerrainFactory{
    @Override
    public Terrain createTerrain() {
        return new City();
    }
}
