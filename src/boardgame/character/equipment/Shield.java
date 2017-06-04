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
public class Shield implements IEquipment{
    private final double attackPower;
    private final double defensePower;

    public Shield() {
        attackPower = 5;
        defensePower = 15;
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
