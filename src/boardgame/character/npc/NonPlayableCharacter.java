/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boardgame.character.npc;

import boardgame.character.Character;
import boardgame.character.equipment.IEquipment;

/**
 *
 * @author Cloudbuilt
 */
public abstract class NonPlayableCharacter extends Character{
    
    public NonPlayableCharacter(double attackPower, double defensePower, double maxLife, Role role, IEquipment weapon, IEquipment shield) {
        super(getNpcName(role), attackPower, defensePower, maxLife, role, weapon, shield);
    }
    
    protected static String getNpcName(Role role){
        return role.toString();
    }
    
}
