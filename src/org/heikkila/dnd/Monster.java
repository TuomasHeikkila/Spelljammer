package org.heikkila.dnd;

import dnd.tables.ChallengeRating;

public class Monster {
	ChallengeRating cr;

	public ChallengeRating getCr() {
		return cr;
	}
	public void setCr(ChallengeRating cr) {
		this.cr = cr;
	}

	public Monster(ChallengeRating ofCR) {
		this.setCr(ofCR);
	}

	
}
