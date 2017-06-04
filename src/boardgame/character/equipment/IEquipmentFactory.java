/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boardgame.character.equipment;

import boardgame.character.equipment.IEquipment.Type;

/**
 *
 * @author Cloudbuilt
 */
public interface IEquipmentFactory {
    IEquipment createEquipment(Type equipmentType);
}
