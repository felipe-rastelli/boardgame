/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boardgame.character;

import boardgame.character.equipment.IEquipment;

/**
 *
 * @author Cloudbuilt
 */
public interface ICharacterFactory {
    ICharacter createCharacter(String name, ICharacter.Role role, IEquipment.Type weapon, IEquipment.Type shield);
}
