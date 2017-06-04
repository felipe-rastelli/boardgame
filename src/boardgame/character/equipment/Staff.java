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
public class Staff implements IEquipment{
    private final double attackPower;
    private final double defensePower;

    public Staff() {
        attackPower = 15;
        defensePower = 5;
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
