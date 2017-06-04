/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boardgame.character.equipment;

/**
 *
 * @author Cloudbuilt
 */
public interface IEquipment {
    double attackPower();
    double defensePower();
    
    public enum Type{
        AXE,
        SWORD,
        STAFF,
        SHIELD,
        UNEQUIPPED
    }
}
