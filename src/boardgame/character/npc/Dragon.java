/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boardgame.character.npc;

import boardgame.character.equipment.IEquipment;

/**
 *
 * @author Cloudbuilt
 */
public class Dragon extends NonPlayableCharacter{

    public Dragon(IEquipment weapon, IEquipment shield) {
        super(90, 80, 400, Role.DRAGON, weapon, shield);
    }

    @Override
    protected double weaponAttackBonus() {
        return 0;
    }

    @Override
    protected double weaponDefenseBonus() {
        return 0;
    }

    @Override
    protected double shieldAttackBonus() {
        return 0;
    }

    @Override
    protected double shieldDefenseBonus() {
        return 0;
    }
    
}
