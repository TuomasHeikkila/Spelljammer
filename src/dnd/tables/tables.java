package dnd.tables;

import org.heikkila.dnd.spelljammer.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
 


public class tables {
}



// Tables for critical hits
class critTable extends tables{
	
	
    // Table of critical hit results for slashing weapons
    static Map<Integer, String> slashingTable = new HashMap<Integer, String>() {
		private static final long serialVersionUID = 4734851804052191754L;
	{
        put(1, "2x damage.");
        put(31, "2x damage, chance shield breaks d2.");
        put(41, "3x damage.");
        put(66, "3x damage, chance shield breaks d2.");
        put(70, "Hand slashed open, -1 to combat.");
        put(71, "Lose 1 finger.");
        put(72, "Lose 1d4 fingers, hand incapacitated.");
        put(73, "Foot slashed open, 1/2 move speed.");
        put(74, "Lose 1d2 toes, 1/2 move speed.");
        put(75, "Leg slashed open, 1/2 move speed.");
        put(76, "Leg removed at ankle.");
        put(77, "Leg removed at knee.");
        put(78, "Leg removed just below hip.");
        put(79, "Wrist removed.");
        put(80, "Elbow removed.");
        put(81, "Arm removed just below shoulder.");
        put(82, "Abdomen ripped open, guts hanging out, roll STR or fall.");
        put(83, "Abdomen ripped open, guts hanging out, stunned 1 round.");
        put(84, "Abdomen ripped open, death.");
        put(85, "Lung slashed, -1 to combat.");
        put(86, "Rib broken, stunned 1 round.");
        put(87, "Chest slashed open, death.");
        put(88, "Throat cut, no speech.");
        put(90, "Chest slashed, opponent takes -2 to combat.");
        put(91, "Throat cut, death.");
        put(93, "Eye removed, stunned for 1 round.");
        put(94, "Stabbed through the eye and brain, death.");
        put(95, "Ear removed, stunned for 1 round.");
        put(96, "Ear removed and shoulder cut. Immobilized, with three rounds until blood loss death.");
        put(97, "Nose shattered.");
        put(98, "Teeth shattered.");
        put(99, "Decapitated, death.");
        put(100, "Cut in two, death.");
    }};

    // Table of critical hit results for bludgeoning weapons
    static Map<Integer, String> bludgeoningTable = new HashMap<Integer, String>() {
		private static final long serialVersionUID = 1655265323844398097L;

	{
        put(1, "2x damage.");
        put(31, "2x damage, chance shield breaks d2.");
        put(41, "3x damage.");
        put(66, "3x damage, chance shield breaks d2.");
        put(70, "Hand smashed, -1 to combat.");
        put(71, "1d4 fingers broken and hand is incapacitated.");
        put(72, "Broken hand and incapacitated.");
        put(73, "Toe crushed, 1/2 move speed.");
        put(74, "Foot smashed, 1/4 move speed.");
        put(75, "Crushed thigh, roll DEX or fall, 1/2 move speed.");
        put(76, "Broken knee, 1/4 move.");
        put(77, "Broken hip bone, opponent falls, 1/4 move speed.");
        put(78, "Broken shin, opponent falls, 1/4 move speed.");
        put(79, "Broken wrist, drop item.");
        put(80, "Broken elbow, drop item.");
        put(81, "Broken arm, shoulder incapacitated, drop item.");
        put(82, "Smashed guts, roll STR or fall.");
        put(83, "Crushed guts, stunned 1 round.");
        put(84, "Pulped guts, death.");
        put(85, "Shoulder smashed, -1 to combat.");
        put(86, "Shoulder crushed, -1 to combat.");
        put(87, "Rib broken, stunned 1 round.");
        put(88, "Ribs shattered. Roll a d6, 1-3: incapacitated, 4-6 punctured heart and death.");
        put(90, "Chest crushed, opponent -2 to combat.");
        put(91, "Chest crushed, death.");
        put(93, "Skull hit, stunned 1 round, lose 1d4 int.");
        put(94, "Skull hit, stunned 1d4 round, lose 1d4 int.");
        put(95, "Skull hit, stunned 1d4 round, lose 2d4 int.");
        put(96, "Skull hit, knocked out 1d4 round, lose 2d4 int.");
        put(97, "Nose crushed.");
        put(98, "Teeth crushed.");
        put(99, "Skull crushed, death.");
        put(100, "Groin crushed, death.");
    }};

    // Table of critical hit results for piercing weapons
    static Map<Integer, String> piercingTable = new HashMap<Integer, String>() {
		private static final long serialVersionUID = -4860230510488991636L;

	{
        put(1, "2x damage.");
        put(31, "2x damage, chance shield breaks d2.");
        put(41, "3x damage.");
        put(66, "3x damage, chance shield breaks d2.");
        put(70, "Punctured muscle in off-hand, -1 to combat, roll CON or incapacitated.");
        put(71, "Punctured muscle in main-hand, -3 to combat, roll CON or incapacitated.");
        put(72, "Muscle pierced, hand incapacitated, 1d6 bleeding.");
        put(73, "Punctured muscle in foot, 1/2 move speed.");
        put(74, "Punctured muscle in foot, 1/2 move speed, roll CON or incapacitated.");
        put(75, "Punctured thigh, roll DEX or fall, 1/4 move speed.");
        put(76, "Punctured thigh, roll DEX or fall, 1/4 move speed, roll CON or incapacitated.");
        put(77, "Split knee, fall, 1/2 move speed.");
        put(78, "Split knee, fall, 1/4 move speed.");
        put(79, "Pierced wrist, -1 to combat, d2 to determine wrist.");
        put(80, "Torn shoulder, -1 to combat, roll CON or incapacitated, d2 to determine shoulder.");
        put(81, "Arm incapacitated at shoulder, d2 to determine shoulder.");
        put(82, "Punctured stomach, roll STR or fall, 1d6 bleeding.");
        put(83, "Stabbed in abdomen, (1-3) 2d10 extra damage, (4-6) 4d10 extra damage.");
        put(84, "Stabbed in abdomen, death.");
        put(85, "Chest pierced, -1 to combat, 1d6 bleeding.");
        put(86, "Lung pierced, stunned 1 round, 1d6 bleeding, roll CON or incapacitated.");
        put(87, "Rib broken, stunned 1 round.");
        put(88, "Lung pierced, stunned 1 round, roll CON or death.");
        put(90, "Heart pierced, death.");
        put(91, "Throat pierced, no speech, 1d10 bleeding.");
        put(93, "Throat pierced, death.");
        put(95, "Eye removed.");
        put(96, "Both eyes removed.");
        put(97, "Skull pierced, stunned 1 round, lose 1d4 INT.");
        put(98, "Skull pierced, stunned 1 round, lose 1d8 INT.");
        put(99, "Skull pierced, death.");
        put(100, "Heart pierced, death, if an enemy is standing behind the character in a straight line within your speed, run them through. Deal standard critical damage.");
    }};

    // Table of critical hit results for using magic
    static Map<Integer, String> magicTable = new HashMap<Integer, String>() {
		private static final long serialVersionUID = -6269388350080745906L;

	{
        put(1, "2x damage.");
        put(31, "2x damage, chance shield breaks d2.");
        put(41, "3x damage.");
        put(66, "3x damage, chance shield breaks d2.");
        put(70, "Hand incapacitated, -1 to combat.");
        put(71, "Lose 1 finger.");
        put(72, "Lose 1d4 fingers, hand incapacitated.");
        put(73, "Foot incapacitated, 1/2 move speed.");
        put(74, "Lose 1d2 toes, 1/2 move speed.");
        put(75, "Leg torn open, 1/2 move speed.");
        put(76, "Leg removed at ankle.");
        put(77, "Leg removed at knee.");
        put(78, "Leg removed just below hip.");
        put(79, "Wrist removed.");
        put(80, "Elbow removed.");
        put(81, "Arm removed just below shoulder.");
        put(82, "Abdomen bursts, guts hanging out, roll STR or fall.");
        put(83, "Abdomen bursts, guts hanging out, stunned 1 round.");
        put(84, "Abdomen explodes, death.");
        put(85, "Lung incapacitated, -1 to combat.");
        put(86, "Rib broken, stunned 1 round.");
        put(87, "Chest impacted, death.");
        put(88, "Throat impacted, no speech.");
        put(90, "Chest torn open, opponent takes -2 to combat.");
        put(91, "Throat destroyed, death.");
        put(93, "Eye removed, stunned for 1 round.");
        put(94, "Heart impacted. Incapacitated and three rounds until death.");
        put(95, "Ear removed, stunned for 1 round.");
        put(96, "Ear to shoulder blast through. Immobilized, with three rounds until blood loss death.");
        put(97, "Nose destroyed.");
        put(98, "Teeth destroyed. If Poison or Acid, death.");
        put(99, "Head blown off, death.");
        put(100, "Obliterated, death.");
    }};


    // Method for returning correct weapon table
    public static Map<Integer, String> getTable(String tableName) {

        if (tableName == "slashingTable")
            return slashingTable;
        else if (tableName == "bludgeoningTable")
            return bludgeoningTable;
        else if (tableName == "piercingTable")
            return piercingTable;
        else if (tableName == "magicTable")
            return magicTable;

        // Standard response
        // Should not be reached
        return null;
    }
}

// Tables for fumbles
class fumbleTable extends tables{

    // Table of fumble results for all weapons
    static Map<Integer, String> resultTable = new HashMap<Integer, String>() {
		private static final long serialVersionUID = -1566577887286456816L;

	{
        put(1, "You are distracted and trip. Roll DEX or fall.");
        put(26, "You clumsy fool. You fall. Roll DEX or drop primary weapon.");
        put(40, "You clumsily fall and drop your primary weapon. Roll DEX or be stunned for 1 round.");
        put(51, "You are useless! Fall and become stunned for 1 round.");
        put(54, "You have become dazed and lost in your actions. You fall, drop your primary weapon, and are stunned for 1 round.");
        put(58, "You are stunned by your failure. Fall and become stunned for 1d4 rounds.");
        put(60, "You are dazed and become stunned in your confusion. Fall, drop your primary weapon, and be stunned for 1d4 rounds.");
        put(61, "You fall unconscious. Fall, knock head on floor, and you are knocked out for 1d4 rounds.");
        put(62, "You are inept. Weapon disarmed and thrown d20 feet in random direction.");
        put(63, "You are a very inept adventurer. Your Weapon or appendage breaks(d2).");
        put(66, "You klutz. You twist your ankle, 1/2 move speed.");
        put(68, "You're dangerous to yourself. Twist knee, 1/4 move speed.");
        put(70, "As if you were untrained. Twist your wrist, weapon arm incapacitated, drop weapon.");
        put(71, "Vulnerable. Opponent steps on foot, go last next round.");
        put(72, "You're knocked silly. Your helm twists, and you are blind until the end of next round, roll again instead, if no helm.");
        put(73, "Your poor judgement costs you. Opponent's next attack is at +4 to hit.");
        put(75, "You smash your hand. -4 to hit until end of next round.");
        put(77, "Just embarrassing. Armor piece knocked off, strap cut, belt cut, clothes torn, lose 2 armor class until fixed.");
        put(80, "Your mistake leaves you in staggering pain. 1/2 move speed and -4 to hit for 3 rounds.");
        put(81, "Your mistake leaves you numb. -2 damage for 3 rounds.");
        put(82, "Something irritates your eye. -1 to hit until cleaned.");
        put(83, "Your eyes are blinded by dirt, -3 to hit until cleaned.");
        put(84, "Fool. Hit self, normal damage.");
        put(86, "Useless fool. Hit self, normal damage and stunned for 1 round.");
        put(87, "You moron. Hit self, double damage.");
        put(89, "Useless moron. Hit self, double damage and stunned for 1 round.");
        put(90, "You're a complete moron. Hit self, critical hit.");
        put(91, "You are unaware of your surroundings, and it will cost your allies. Hit friend, normal damage.");
        put(93, "Pay more attention. Hit friend, normal damage, and friend stunned for 1 round.");
        put(94, "Watch what you're doing moron. Hit friend, double damage.");
        put(96, "You are a liability to yourself and others. Hit friend, double damage, and friend stunned for 1 round.");
        put(97, "You will be the downfall of your allies. Hit friend, critical hit.");
        put(98, "Roll twice on fumble table, if this comes up again, re-roll.");
        put(99, "Roll three times on fumble table, if this comes up again, re-roll.");
        put(100, "Roll three times on fumble table, if this comes up again, add two more rolls.");
    }};
    
}

//Tables for fumbles
class shipCrit extends tables{

 // Table of fumble results for all weapons
 static Map<Integer, String> resultTable = new HashMap<Integer, String>() {
		private static final long serialVersionUID = -1566577887286456816L;

	{
	    put(1, "Loss of 5 Hull points");
	    put(2, "Deck crew casualty");
	    put(3, "Interior crew casualty");
	    put(4, "Ship Shaken");
	    put(5, "Large weapon damaged");
	    put(6, "Deck crew casualty");
	    put(7, "Hull holed");
	    put(8, "Maneuverabili);ty loss");
	    put(9, "Loss of 10 Hull points");
	    put(10, "Ship Shaken");
	    put(11, "Fire!");
	    put(12, "Loss of SR");
	    put(13, "Deck crew casualty");
	    put(14, "Large weapon damaged");
	    put(15, "Ship Shaken");
	    put(16, "Hull Holed");
	    put(17, "Maneuverability loss");
	    put(18, "Loss of 10 Hull points");
	    put(19, "Helm hit");
	    put(20, "Spelljammer Shock!");
    }};
    
}

class shipWeapons {
	//NAME | SIZE | AC | HITPOINTS | ATTACKMODIFIER | RANGE | DAMAGE | IDEALCREW | COST | NOTES
	 static Map<Integer, Armament> mediumWeapons = new HashMap<Integer, Armament>() {
			private static final long serialVersionUID = -1566577887286456816L;
	{ 
	    put(1, new Armament("Light Catapult" , "Medium" , 15 , 90 , "+5" , "2500 yds / 2286 m" , "22 (4d10) bludgeoning" , 3 , "1,000gp" , "Can't hit targets within 120 ft.(37 m) of it"));
	    put(2, new Armament("Light Ballista" , "Medium" , 15 , 30 , "+6" , "3000 yds / 2743 m" , "5 (1d10) piercing" , 2 , "500 gp", ""));
	    put(3, new Armament("Light Jettison" , "Medium" , 15 , 90 , "+5" , "1500 yds / 1372 m" , "3 (1d6) bludgeoning to all creatures in a 5 ft.(1.5m) radius" , 2, "1,000gp", ""));
    }};
	 static Map<Integer, Armament> largeWeapons = new HashMap<Integer, Armament>() {
			private static final long serialVersionUID = -1566577887286456816L;
	{ 
	    put(1, new Armament("Medium Catapult" , "Large" , 15 , 120 , "+5" , "2000 yds / 1829 m" , "33 (6d10) bludgeoning" , 4 , "2,500gp" , "Can't hit targets within 90 ft.(27 m) of it"));
	    put(2, new Armament("Medium Ballista" , "Large" , 15 , 50 , "+6" , "2000 yds / 1829 m" , "16 (3d10) piercing" , 3 , "1,000gp", ""));
	    put(3, new Armament("Cannon" , "Large" , 19 , 75 , "+6" , "1,000 yds / 914 m" , "44 (8d10) bludgeoning" , 3 , "20,000gp", ""));
	    put(4, new Armament("Medium Jettison" , "Large" , 15 , 120 , "+5" , "1000 yds / 914 m" , "7 (2d6) bludgeoning to all creatures in a 10ft (3m) radius" , 3, "2500gp", ""));
	    put(5, new Armament("Greek Fire Projector" , "Large" , 19 , 80 , "+6" , "500 yds / 457 m", "27 (5d10) fire" , 4, "10,000gp" , "Starts fires"));

 }};
	 static Map<Integer, Armament> hugeWeapons = new HashMap<Integer, Armament>() {
			private static final long serialVersionUID = -1566577887286456816L;
	{ 
	 put(1, new Armament("Trebuchet" , "Huge" , 15 , 150 , "+5" , "1500 yds / 1372 m" , "44 (8d10) bludgeoning" , 5 , "5,000gp" , "Counts as two large weaponinstallations, Can't hit targetswithin 60 ft. (18 m) of it"));
	 put(2, new Armament("Heavy Ballista" , "Huge" , 15 , 70 , "+6" , "1000 yds / 914 m" , "27 (5d10) piercing" , 4 , "1,500gp" , "Counts as two large weapon installations"));
	 put(3, new Armament("Heavy Jettison" , "Huge" , 15 , 150 , "+5" , "500 yds / 457 m" , "10 (3d6) bludgeoning to all creatures in a 15 ft(4.5 m) radius" , 4, "5000gp" , "Counts as two large weapon installations"));
	
	}};
	
	static Armament[] getRandomMediumWeapons(int amount) {
		Armament[] returnValue = new Armament[amount];
		for (int i = 0; i < amount; i++) {
			Random r = new Random();
			int randomIndex = r.nextInt(2)+1;
 			returnValue[i] = mediumWeapons.get(randomIndex);
		}
		return returnValue; 			
	}	
	static Armament[] getRandomLargeWeapons(int amount) {
		Armament[] returnValue = new Armament[amount]; 
		for (int i = 0; i < amount; i++) {
			Random r = new Random();
			int randomIndex = r.nextInt(4)+1;
			returnValue[i] = largeWeapons.get(randomIndex);
		}
		return returnValue; 			
	}	
	static Armament[] getRandomHugeWeapons(int amount) {
		Armament[] returnValue = new Armament[amount];
		for (int i = 0; i < amount; i++) {
			Random r = new Random();
			int randomIndex = r.nextInt(2)+1;
			returnValue[i] = hugeWeapons.get(randomIndex);
		}
		return returnValue; 			
	}
	static Armament[] concat(Armament[] a, Armament[] b, Armament[] c) {
        Armament[] d = concat(a,b);
        Armament[] result = concat(d, c); 
        return result;
	}
	
	static Armament[] concat(Armament[] a, Armament[] b) {
        int length = a.length + b.length;
        Armament[] result = new Armament[length];
        int pos = 0;
        for (Armament element : a) {
            result[pos] = element;
            pos++;
        }
        for (Armament element : b) {
            result[pos] = element;
            pos++;
        }
        return result;
	}
}


