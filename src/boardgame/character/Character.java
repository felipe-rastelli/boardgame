/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boardgame.character;

import boardgame.character.equipment.IEquipment;

/**
 *
 * @author Cloudbuilt
 */
public abstract class Character implements ICharacter{
    private String name;
    private final double attackPower;
    private final double defensePower;
    private final double maxLife;
    private double remaningLife;
    private final Role role;
    private final IEquipment weapon;
    private final IEquipment shield;

    public Character(String name, double attackPower, double defensePower, double maxLife, Role role, IEquipment weapon, IEquipment shield) {
        this.name = name;
        this.attackPower = attackPower;
        this.defensePower = defensePower;
        this.maxLife = maxLife;
        this.remaningLife = maxLife;
        this.role = role;
        this.weapon = weapon;
        this.shield = shield;
    }
    
    public String getName() {
        return name;
    }
        
    @Override
    public Role getRole() {
        return role;
    }

    public IEquipment getWeapon() {
        return weapon;
    }

    public IEquipment getShield() {
        return shield;
    }
    
    @Override
    public final double attack() {
        double attack = (0.4 + (Math.random() * (1 - 0.4))) * (attackPower() + weaponAttackBonus() + shieldAttackBonus());
        System.out.printf("%s infligiu %.2f de dano \n", this.name, attack);
        return attack;
    }

    @Override
    public final void defend(double damage) {
        double damageReceived = ((0.5 + (Math.random() * (1 - 0.5))) * (damage - defensePower() + weaponDefenseBonus() + shieldDefenseBonus()));
        System.out.printf("%s recebeu %.2f de dano \n", this.name, damageReceived);
        removeLife(damageReceived);
    }

    @Override
    public final double attackPower() {
        return attackPower + weapon.attackPower() + shield.attackPower();
    }

    @Override
    public final double defensePower() {
        return defensePower + weapon.defensePower() + shield.defensePower();
    }
    
    protected abstract double weaponAttackBonus();
    
    protected abstract double weaponDefenseBonus();

    protected abstract double shieldAttackBonus();
    
    protected abstract double shieldDefenseBonus();
    
    @Override
    public double remaningLife() {
        return remaningLife < 0 ? 0 : remaningLife;
    }

    @Override
    public double maxLife() {
        return maxLife;
    }

    @Override
    public void recoverLife(ICharacter character) {
        remaningLife = 0.3 * character.maxLife();
    }
    
    private void removeLife(double damage){
        remaningLife -= damage;
        System.out.printf("%s está com %.2f de vida \n", this.name, remaningLife());
    }
        
}
