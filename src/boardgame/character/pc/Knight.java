/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boardgame.character.pc;

import boardgame.character.equipment.Axe;
import boardgame.character.equipment.IEquipment;
import boardgame.character.equipment.Sword;

/**
 *
 * @author Cloudbuilt
 */
public class Knight extends PlayableCharacter{

    public Knight(String name, IEquipment weapon, IEquipment shield) {
        super(name, 15, 10, 200, Role.KNIGHT, weapon, shield);
    }

    @Override
    protected double weaponAttackBonus() {
        if(getWeapon() instanceof Sword){
            return 55;
        }else if(getWeapon() instanceof Axe){
            return 25;
        }
        return 0;
    }

    @Override
    protected double weaponDefenseBonus() {
        if(getWeapon() instanceof Sword){
            return 25;
        }else if(getWeapon() instanceof Axe){
            return 10;
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
            return 15;
        }
        return 0;
    }
    
}
