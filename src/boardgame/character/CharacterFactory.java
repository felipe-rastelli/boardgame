/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boardgame.character;

import boardgame.character.ICharacter.Role;
import boardgame.character.equipment.IEquipment;
import boardgame.character.equipment.IEquipmentFactory;
import boardgame.character.npc.Dragon;
import boardgame.character.npc.Vampire;
import boardgame.character.npc.Werewolf;
import boardgame.character.pc.Gladiator;
import boardgame.character.pc.Knight;
import boardgame.character.pc.Mage;

/**
 *
 * @author Cloudbuilt
 */
public class CharacterFactory implements ICharacterFactory{
    IEquipmentFactory factory;
    
    public CharacterFactory(IEquipmentFactory factory) {
        this.factory = factory;
    }

    @Override
    public ICharacter createCharacter(String name, Role role, IEquipment.Type weapon, IEquipment.Type shield) {
        switch(role){
            case DRAGON:
                return new Dragon(factory.createEquipment(weapon), factory.createEquipment(shield));
            case VAMPIRE:
                return new Vampire(factory.createEquipment(weapon), factory.createEquipment(shield));
            case WEREWOLF:
                return new Werewolf(factory.createEquipment(weapon), factory.createEquipment(shield));
            case GLADIATOR:
                return new Gladiator(name, factory.createEquipment(weapon), factory.createEquipment(shield));
            case KNIGHT:
                return new Knight(name, factory.createEquipment(weapon), factory.createEquipment(shield));
            case MAGE:
                return new Mage(name, factory.createEquipment(weapon), factory.createEquipment(shield));
            default:
                return null;
        }
    }
    
}
