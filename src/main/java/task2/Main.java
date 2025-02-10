package task2;

import task2.characters.Character;

import task2.factories.ArcherFactory;
import task2.factories.CharacterFactory;
import task2.factories.CityFactory;
import task2.factories.DesertFactory;
import task2.factories.ForestFactory;
import task2.factories.MagicianFactory;
import task2.factories.TerrainFactory;
import task2.factories.WarriorFactory;
import task2.game.Game;
import task2.terrain.Terrain;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CharacterFactory characterFactory = null;
        while (characterFactory == null) {
            System.out.println("Выберите персонажа: 1. Маг 2. Воин 3. Стрелок:");
            int characterChoice = sc.nextInt();
            switch (characterChoice) {
                case 1 -> characterFactory = new MagicianFactory();
                case 2 -> characterFactory = new WarriorFactory();
                case 3 -> characterFactory = new ArcherFactory();
                default -> System.out.println("Неверный выбор, попробуйте снова!");
            }
        }

        Character character = characterFactory.createCharacter();

        TerrainFactory terrainFactory = null;
        while (terrainFactory == null) {
            System.out.println("Выберите местность: 1. Пустыня 2. Лес 3. Город:");
            int terrainChoice = sc.nextInt();
            switch (terrainChoice) {
                case 1 -> terrainFactory = new DesertFactory();
                case 2 -> terrainFactory = new ForestFactory();
                case 3 -> terrainFactory = new CityFactory();
                default -> System.out.println("Неверный выбор, попробуйте снова!");
            }
        }

        Terrain terrain = terrainFactory.createTerrain();

        String situation = Game.generateSituation(character, terrain);
        System.out.println(situation);

        sc.close();
    }
}