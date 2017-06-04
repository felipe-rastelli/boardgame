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
public class Werewolf extends NonPlayableCharacter{

    public Werewolf(IEquipment weapon, IEquipment shield) {
        super(45, 40, 250, Role.WEREWOLF, weapon, shield);
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
