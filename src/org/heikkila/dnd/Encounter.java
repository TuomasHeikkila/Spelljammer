package org.heikkila.dnd;

import java.util.List;

import dnd.tables.ChallengeRating;

public class Encounter {
	private double powerlevel;
	List<Monster> monsters;
	
	private void addMonster(int monsterCount) {
		if (monsterCount == 1) 
			addSoloMonster();
		else
			addMonsters(monsterCount);
	}
	
	private void addSoloMonster() { 
		monsters.add(new Monster(ChallengeRating.determine(1)));
	}
	private void addMonsters(int monsterCount) {
		monsters.add(new Monster(ChallengeRating.determine(monsterCount)));		
	}
}
