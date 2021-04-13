package dnd.tables;

import org.heikkila.GlobalData;
import org.heikkila.dnd.Rating;

public class ChallengeRating {
	Rating rating;
	
	public ChallengeRating(Rating r) {
		this.rating = r;
	}

	public static ChallengeRating determine(double dividend) {
		double rating = GlobalData.getCurrentParty().headcount() / dividend;
		return null;
	}
}