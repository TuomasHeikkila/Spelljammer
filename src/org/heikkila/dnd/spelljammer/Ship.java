package org.heikkila.dnd.spelljammer;
import org.heikkila.dnd.Character;
public class Ship {
	//shiptype | cost | crew min | crew max | MR | AC | HP | DT | keel len | beam len | armament | helm type
	private int movementUsedThisTurn;
	
	private int xpos, ypos, zpos; // in feet, in a battle zone of 
	
	private Character helmsman;
	private String shiptype;
	private String cost;
	private int crewMin;
	private int crewMax;
	private int MR;
	private int AC;
	private int HP;
	private int DT;
	private String  keelLength;
	private String beamLength;
	private Armament[] arms;
	private HelmTypes[] allowedHelms;
	private Helm currentHelm;
		
	public Ship(String shiptype, String cost, int crewMin, int crewMax, int MR, int AC, int HP, int DT, String keelLength, String beamLength,
			Armament[] armamentArray, HelmTypes[] helmArray) {
		this.shiptype = shiptype; 
		this.cost = cost;
		this.crewMin  = crewMin ;
		this.crewMax = crewMax;
		this.MR  = MR ;
		this.AC  = AC ;
		this.HP  = HP ;
		this.DT = DT;
		this.keelLength  = keelLength ;
		this.beamLength = beamLength;
		this.arms = armamentArray;
		this.allowedHelms = helmArray; 
	}

	public Ship() {
		// TODO Auto-generated constructor stub
	}
	
	public Ship(String seedcode) {
		
	}
	
	public String toString() {
		String returnValue = 
				shiptype + ", worth " + cost + "\r\n" +
				"minimum crew: " + crewMin + "\r\n" +
				"maximum crew: " + crewMax +  "\r\n" +
				"MR: " + MR + "\r\n" +
				"AC: " + AC + "\r\n" +
				"HP: " + HP + "\r\n" +
				"HP: " + HP + "\r\n" +
				"DT: " + DT + "\r\n" +
				"keelLength: " + keelLength + "\r\n" +
				"beamLength: " + beamLength + "\r\n";
		returnValue += "---------------------------------"+ "\r\n";
		for (Armament a : arms) {
			returnValue += "- Armament: " + a.getName() + "\r\n";
		}	
		returnValue += "---------------------------------"+ "\r\n";
		returnValue += "Allowed helms: "+ "\r\n";
		for (HelmTypes h : allowedHelms) {
			returnValue += h.toString()+ "\r\n";
		} 
		
		return returnValue;
	}
	public int getShipRating() {
		return (int) Math.floor(helmsman.getCasterLevel() * this.getCurrentHelm().getHelmTypeModifier());
	}

	public int getMovementUsedThisTurn() {
		return movementUsedThisTurn;
	}

	public void setMovementUsedThisTurn(int movementUsedThisTurn) {
		this.movementUsedThisTurn = movementUsedThisTurn;
	}

	public int getXpos() {
		return xpos;
	}

	public void setXpos(int xpos) {
		this.xpos = xpos;
	}

	public int getYpos() {
		return ypos;
	}

	public void setYpos(int ypos) {
		this.ypos = ypos;
	}

	public int getZpos() {
		return zpos;
	}

	public void setZpos(int zpos) {
		this.zpos = zpos;
	}

	public Character getHelmsman() {
		return helmsman;
	}

	public void setHelmsman(Character helmsman) {
		this.helmsman = helmsman;
	}

	public String getShiptype() {
		return shiptype;
	}

	public void setShiptype(String shiptype) {
		this.shiptype = shiptype;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public int getCrewMin() {
		return crewMin;
	}

	public void setCrewMin(int crewMin) {
		this.crewMin = crewMin;
	}

	public int getCrewMax() {
		return crewMax;
	}

	public void setCrewMax(int crewMax) {
		this.crewMax = crewMax;
	}

	public int getMR() {
		return MR;
	}

	public void setMR(int mR) {
		MR = mR;
	}

	public int getAC() {
		return AC;
	}

	public void setAC(int aC) {
		AC = aC;
	}

	public int getHP() {
		return HP;
	}

	public void setHP(int hP) {
		HP = hP;
	}

	public int getDT() {
		return DT;
	}

	public void setDT(int dT) {
		DT = dT;
	}

	public String getKeelLength() {
		return keelLength;
	}

	public void setKeelLength(String keelLength) {
		this.keelLength = keelLength;
	}

	public String getBeamLength() {
		return beamLength;
	}

	public void setBeamLength(String beamLength) {
		this.beamLength = beamLength;
	}

	public Armament[] getArms() {
		return arms;
	}

	public void setArms(Armament[] arms) {
		this.arms = arms;
	}

	public HelmTypes[] getAllowedHelms() {
		return allowedHelms;
	}

	public void setAllowedHelms(HelmTypes[] allowedHelms) {
		this.allowedHelms = allowedHelms;
	} 

	public Helm getCurrentHelm() {
		return currentHelm;
	}

	public void setCurrentHelm(Helm currentHelm) {
		for (HelmTypes h : allowedHelms) {
			if (h == currentHelm.getType()) { // jos laivaan voi laittaa t�mm�isen ruorin
				this.currentHelm = currentHelm;			
			}
		} 
	} 	 
}
