/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boardgame.character.pc;

import boardgame.character.Character;
import boardgame.character.equipment.IEquipment;

/**
 *
 * @author Cloudbuilt
 */
public abstract class PlayableCharacter extends Character{

    public PlayableCharacter(String name, double attackPower, double defensePower, double maxLife, Role role, IEquipment weapon, IEquipment shield) {
        super(name, attackPower, defensePower, maxLife, role, weapon, shield);        
    }
    
}
