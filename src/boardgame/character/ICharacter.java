/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boardgame.character;


/**
 *
 * @author Cloudbuilt
 */
public interface ICharacter {
    Role getRole();
    double attack();
    void defend(double damage);
    double attackPower();
    double defensePower();
    double remaningLife();
    double maxLife();
    void recoverLife(ICharacter character);
    
    public enum Role{
        GLADIATOR,
        KNIGHT,
        MAGE,
        VAMPIRE{
            @Override
            public String toString() {
                return "Vampire";
            }
            
        },
        DRAGON{
            @Override
            public String toString() {
                return "Dragon";
            }
            
        },
        WEREWOLF{
            @Override
            public String toString() {
                return "Werewolf";
            }
            
        }
    }
}
