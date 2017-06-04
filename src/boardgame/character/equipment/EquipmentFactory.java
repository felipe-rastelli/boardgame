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
public class EquipmentFactory implements IEquipmentFactory{

    public EquipmentFactory() {
    }    

    @Override
    public IEquipment createEquipment(IEquipment.Type equipmentType) {
        switch(equipmentType){
            case AXE:
                return new Axe();
            case SWORD:
                return new Sword();
            case STAFF:
                return new Staff();
            case SHIELD:
                return new Shield();
            default:
                return new Unequipped();
        }
    }
    
}
