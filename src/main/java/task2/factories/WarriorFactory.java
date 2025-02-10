package task2.factories;

import task2.characters.Warrior;
import task2.characters.Character;

public class WarriorFactory implements CharacterFactory{
    @Override
    public Character createCharacter() {
        return new Warrior();
    }
}
