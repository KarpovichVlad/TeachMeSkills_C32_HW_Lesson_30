package task2.factories;

import task2.characters.Magician;
import task2.characters.Character;

public class MagicianFactory implements CharacterFactory{
    @Override
    public Character createCharacter() {
        return new Magician();
    }
}
