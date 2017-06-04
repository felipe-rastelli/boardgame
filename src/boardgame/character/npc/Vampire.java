/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boardgame.character.npc;

import boardgame.character.equipment.Axe;
import boardgame.character.equipment.IEquipment;
import boardgame.character.equipment.Sword;

/**
 *
 * @author Cloudbuilt
 */
public class Vampire extends NonPlayableCharacter{

    public Vampire(IEquipment weapon, IEquipment shield) {
        super(35, 30, 250, Role.VAMPIRE, weapon, shield);
    }

    @Override
    protected double weaponAttackBonus() {
        if(getWeapon() instanceof Sword){
            return 15;
        }else if(getWeapon() instanceof Axe){
            return 15;
        }
        return 0;
    }

    @Override
    protected double weaponDefenseBonus() {
        if(getWeapon() instanceof Sword){
            return 5;
        }else if(getWeapon() instanceof Axe){
            return 5;
        }
        return 0;
    }

    @Override
    protected double shieldAttackBonus() {
        if(getWeapon() instanceof Sword){
            return 5;
        }
        return 0;
    }

    @Override
    protected double shieldDefenseBonus() {
        if(getWeapon() instanceof Sword){
            return 10;
        }
        return 0;
    }
    
}
