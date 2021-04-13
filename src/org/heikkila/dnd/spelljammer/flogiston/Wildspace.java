package org.heikkila.dnd.spelljammer.flogiston;

import java.util.LinkedList;
import java.util.List;

import dnd.randomizer.Roll;

public class Wildspace {  
	List<CelestialBody> celestialBodies = new LinkedList<>();
	
	
	public static Wildspace generateAround(CelestialBody primaryBody) {
		Roll roll = new Roll();
		int AMOUNT_OF_CELESTIAL_BODIES = roll.d20();
		Wildspace wildspaceToBuild = new Wildspace();
		for (int i=0; i < AMOUNT_OF_CELESTIAL_BODIES; i++) {
			wildspaceToBuild.celestialBodies.add(CelestialBody.build());
		}
		for (CelestialBody cb : wildspaceToBuild.celestialBodies) {
			System.out.println(cb.toString());
		}
		return null;
	}

}
