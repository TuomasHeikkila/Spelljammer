package org.heikkila.dnd;

import java.util.List;

public class Party {
	List<Character> characters;
	
	public int medianLevel() {
		int flooredMedian = 0;
		for (Character c : characters) {
			flooredMedian += Math.floorDiv(c.getLevel(), characters.size());
		}
		return flooredMedian;
	}
	public int headcount() {
		return characters.size();
	}
}
