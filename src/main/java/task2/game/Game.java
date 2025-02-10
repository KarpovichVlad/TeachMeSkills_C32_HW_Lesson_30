package task2.game;

import task2.terrain.Terrain;
import task2.characters.Character;

public class Game {
    public static String generateSituation(Character character, Terrain terrain) {
        return character.getDescription() + " находится в " + terrain.getDescription() + ".";
    }
}
