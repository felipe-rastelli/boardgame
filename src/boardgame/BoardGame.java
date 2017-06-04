/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boardgame;

import boardgame.character.CharacterFactory;
import boardgame.character.ICharacter;
import boardgame.character.ICharacter.Role;
import boardgame.character.equipment.EquipmentFactory;
import boardgame.character.equipment.IEquipment;
import boardgame.character.equipment.IEquipment.Type;
import boardgame.character.equipment.IEquipmentFactory;
import boardgame.character.npc.Dragon;
import boardgame.character.npc.Vampire;
import boardgame.character.npc.Werewolf;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cloudbuilt
 */
public class BoardGame {
    
    public static void main(String[] args) {
        List<Dragon> dragons = new ArrayList<>();
        List<Werewolf> werewolfs = new ArrayList<>();
        List<Vampire> vampires = new ArrayList<>();
        ICharacter player;
        
        IEquipmentFactory equipmentFactory = new EquipmentFactory();
        CharacterFactory characterFactory = new CharacterFactory(equipmentFactory);
        
        for(int i = 0; i < 2; i++){
            dragons.add((Dragon) characterFactory.createCharacter("", Role.DRAGON, Type.UNEQUIPPED, Type.UNEQUIPPED));
        }
        
        for(int i = 0; i < 15; i++){
            vampires.add((Vampire) characterFactory.createCharacter("", Role.VAMPIRE, Type.SWORD, Type.UNEQUIPPED));
        }
        
        for(int i = 0; i < 15; i++){
            werewolfs.add((Werewolf) characterFactory.createCharacter("", Role.WEREWOLF, Type.UNEQUIPPED, Type.UNEQUIPPED));
        }
        
        werewolfs.get(0).defend(dragons.get(0).attack());
        
        //Criar personagem do jogador
        
        //dragons.get(0).defend(player.attack());
    }
    
}
