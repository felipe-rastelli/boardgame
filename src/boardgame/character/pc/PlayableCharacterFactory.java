/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boardgame.character.pc;

import boardgame.character.CharacterFactory;
import boardgame.character.ICharacter;
import boardgame.character.equipment.IEquipment;
import boardgame.character.equipment.IEquipmentFactory;

/**
 *
 * @author Cloudbuilt
 */
public class PlayableCharacterFactory extends CharacterFactory{

    public PlayableCharacterFactory(IEquipmentFactory factory) {
        super(factory);
    }
    
    public ICharacter createCharacter(String name, ICharacter.Role role, IEquipment.Type weapon, IEquipment.Type shield) {
        return super.createCharacter(name, role, weapon, shield);
    }    
}
