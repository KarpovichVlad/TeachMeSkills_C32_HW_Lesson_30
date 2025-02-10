package task2.factories;

import task2.characters.Archer;
import task2.characters.Character;

public class ArcherFactory implements CharacterFactory{
    @Override
    public Character createCharacter() {
        return new Archer();
    }
}
