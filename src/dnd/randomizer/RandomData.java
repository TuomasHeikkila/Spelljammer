package dnd.randomizer;

import java.util.Scanner;

import dnd.tables.CharacterTable;
import dnd.tables.ShipTypes;
import dnd.tables.tables;
import dnd.tables.CharacterTable;

import org.heikkila.dnd.Encounter;
import org.heikkila.dnd.Character;
import org.heikkila.dnd.spelljammer.*;
import org.heikkila.dnd.spelljammer.flogiston.Sphere;

public class RandomData
{ 
	Choice type;
	public RandomData(Choice param) {
		type = param;
	}
 

	public String create ()
    { 
        Roll roll = new Roll();
        Government gov = new Government();
        Dungeon dungeon = new Dungeon();  
        ShipTypes shiptypes = new ShipTypes();
        
        switch(type)
        {
            case DUNGEON:
                roll.d20(); 
                dungeon.DeathTrap(roll.storedRoll());

                roll.d20(); 
                dungeon.Purpose(roll.storedRoll());

                roll.d20(); 
                dungeon.Maze(roll.storedRoll());

                roll.d20(); 
                dungeon.Mine(roll.storedRoll());

                roll.d100(); 
                dungeon.PlanarGate(roll.storedRoll());
            break;

            case GOVERNANCE:
                roll.d100(); 
                gov.formsOfGovernment(roll.storedRoll());
            break;
            
            case SHIPS: 
            	Ship thisShip = new Ship();
                roll.d20(); 
                thisShip = shiptypes.getShip(roll.storedRoll());
                System.out.println(thisShip.toString());
            break;
            case NPC:  
            	Character thisChar = new Character(roll.d8(), roll.d6(), roll.d100()); 
            	System.out.println(thisChar.toString());
            	break;
            case CRYSTAL_SPHERE:
            	Sphere s = Sphere.create();
            	break;
            	
            	
            	
            	 
        }
        return roll.getSeed();
    }
    

    public String create (String seed)
    { 
        Roll roll = new Roll();
        Government gov = new Government();
        Scanner scan = new Scanner(System.in);
        Dungeon dungeon = new Dungeon();  
        
        switch(type)
        {
            case DUNGEON: 
            	
                dungeon.DeathTrap(Integer.parseInt(seed.substring(0,2)));
 
                dungeon.Purpose(Integer.parseInt(seed.substring(2,4)));
 
                dungeon.Maze(Integer.parseInt(seed.substring(4,6)));
 
                dungeon.Mine(Integer.parseInt(seed.substring(6,8)));
 
                dungeon.PlanarGate(Integer.parseInt(seed.substring(8,10)));
            break;

            case GOVERNANCE:
                roll.d100();
                roll.storedRoll(); 
                gov.formsOfGovernment(roll.storedRoll());
            break;
        }
        scan.close();
        return roll.getSeed();
    }
}
