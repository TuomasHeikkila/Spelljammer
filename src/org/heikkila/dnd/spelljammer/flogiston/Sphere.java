package org.heikkila.dnd.spelljammer.flogiston;

import dnd.randomizer.Roll;

public class Sphere {
	private SystemType type;
	private Sphere subSphere;
	private Wildspace space;
	public Sphere() {
	}
	
	private void setType(SystemType type) {
		this.type = type;
	}

	public Sphere(String seed) {
		
	}
	

	public static Sphere create() {
		Roll roll = new Roll();
		Sphere newSphere = new Sphere();
		
		
		//Type of System
		roll.d10();
		if (roll.storedRoll() > 7) {
			newSphere.setType(SystemType.STANDARD);
		} else {
			roll.d10();
			switch (roll.storedRoll()){
			case 1:
				newSphere.setType(SystemType.FIXED);
				break;
			case 2:
				newSphere.setType(SystemType.FIXED);
				break;
			case 3:
				newSphere.setType(SystemType.CHAOTIC);
				break;
			case 4:
				newSphere.setType(SystemType.CHAOTIC);
				break;
			case 5:
				newSphere.setType(SystemType.QUASIRANDOM);
				break;
			case 6:
				newSphere.setType(SystemType.QUASIRANDOM);
				break;
			case 7:
				newSphere.setType(SystemType.STRANGE);
				break;
			case 8:
				newSphere.setType(SystemType.STRANGE);
				break;
			case 9:
				newSphere.setType(SystemType.VOID);
				break;
			case 10:
				newSphere.subSphere = Sphere.create();
				break;
			}
		}
		
		CelestialBody PrimaryBody = new CelestialBody();
		//Type of System
		roll.d10();
		if (roll.storedRoll() > 7) {
			PrimaryBody.setType(BodyType.FIRE);
		} else {
			roll.d10();
			switch (roll.storedRoll()){
			case 1:
				PrimaryBody.setType(BodyType.WATER);
				break;
			case 2:
				PrimaryBody.setType(BodyType.WATER);
				break;
			case 3:
				PrimaryBody.setType(BodyType.EARTH);
				break;
			case 4:
				PrimaryBody.setType(BodyType.EARTH);
				break;
			case 5:
				PrimaryBody.setType(BodyType.GAS);
				break;
			case 6:
				PrimaryBody.setType(BodyType.GAS);
				break;
			case 7:
				PrimaryBody.setType(BodyType.BLACKHOLE);
				break;
			case 8:
				PrimaryBody.setType(BodyType.BLACKHOLE);
				break;
			case 9:
				PrimaryBody.setType(BodyType.OBJECT);
				break;
			case 10:
				PrimaryBody.setType(BodyType.OBJECT);
				break;
			}
		}
		
		newSphere.setWildspace(Wildspace.generateAround(PrimaryBody));
		return newSphere;
	}

	private void setWildspace(Wildspace generatedSpace) {
		this.space = generatedSpace;
	}
	
}
