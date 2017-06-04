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
public class Sword implements IEquipment{
    private final double attackPower;
    private final double defensePower;

    public Sword() {
        attackPower = 20;
        defensePower = 10;
    }       

    @Override
    public double defensePower() {
        return defensePower;
    }

    @Override
    public double attackPower() {
        return attackPower;
    }
    
}
