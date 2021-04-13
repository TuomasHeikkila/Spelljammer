package org.heikkila.dnd.spelljammer;

public class Armament {
	private String name;
	private String size;
	private int ac;
	private int hp;
	private String modifier;
	private String range;
	private String damage;
	private int idealCrew;
	private String cost;
	private String notes;
	
	 public Armament(String pName, String pSize, int pAc, int pHp, String pAttackModifier, String pRange, String pDamage, int pIdealCrew,
				String pCost, String pNotes) {
	
	  this.setName(pName);
	  this.size = pSize;
	  this.ac = pAc;
	  this.hp = pHp;
	  this.modifier = pAttackModifier;
	  this.range = pRange;
	  this.damage = pDamage;
	  this.idealCrew = pIdealCrew;
	 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} 
	 
	 
}
