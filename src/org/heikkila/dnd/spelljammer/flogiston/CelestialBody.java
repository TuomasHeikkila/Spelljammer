package org.heikkila.dnd.spelljammer.flogiston;

import java.util.Random;

import org.heikkila.CommonMethods;

import dnd.randomizer.Roll;

public class CelestialBody {
	BodyShape shape;
	BodyType type;
	int size; 
	Character category;

	public static CelestialBody build() {
		Roll roll = new Roll();
		int pick;
		CelestialBody body = new CelestialBody();
		pick = new Random().nextInt(BodyType.values().length);
		body.setType(BodyType.values()[pick]);

		pick = new Random().nextInt(BodyShape.values().length);
		body.setShape(BodyShape.values()[pick]);
		
		
		int bellCurve = 0;
		int resolution = roll.d10();
		
		for (int i = 0; i < resolution; i++) 		// Randomoidaan ekka resoluutio hyperbolalle
			bellCurve += roll.d10();					// Heitetään noppaa normaalijakaumaa kohti. 
		bellCurve = Math.round(bellCurve / resolution);
		
		switch (bellCurve) {
		case 1: 
			body.setCategory('A');
			body.setSize(CommonMethods.randomInt(0, 10)); // Size A - Less than 10 miles in diameter
			break;
		case 2:
			body.setCategory('B');
			body.setSize(CommonMethods.randomInt(10, 100)); // Size B - 10-100 miles in diameter
			break;
		case 3:
			body.setCategory('C');
			body.setSize(CommonMethods.randomInt(100, 1000)); // Size C - 100-1,000 miles in diameter
			break;
		case 4:
			body.setCategory('D');
			body.setSize(CommonMethods.randomInt(1000, 4000)); // Size D - 1,000-4,000 miles in diameter
			break;
		case 5:
			body.setCategory('E');
			body.setSize(CommonMethods.randomInt(4000, 10000)); // Size E - 4,000-10,000 miles in diameter
			break;
		case 6:
			body.setCategory('F');
			body.setSize(CommonMethods.randomInt(10000, 40000)); // Size F - 10,000-40,000 miles in diameter
			break;
		case 7:
			body.setCategory('G');
			body.setSize(CommonMethods.randomInt(40000, 100000)); // Size G - 40,000-100,000 miles in diameter
			break;
		case 8:
			body.setCategory('H');
			body.setSize(CommonMethods.randomInt(100000, 10000000)); // Size H - 100,000-1,000,000 miles in diameter
			break;
		case 9:
			body.setCategory('I');
			body.setSize(CommonMethods.randomInt(10000000, 100000000)); // Size I - 1,000,000-10,000,000 miles in diameter
			break;
		case 10:
			body.setCategory('J');
			body.setSize(CommonMethods.randomInt(100000000, Integer.MAX_VALUE)); // Size J - More than 10,000,000 miles in diameter 
			break;
		} 
		
		return body;
	}
	
	public String toString() {
		return 	"=====================================" + System.lineSeparator() +
				"Planetoid type: " + this.getType().toString() + System.lineSeparator() +
				"		   shape: " + this.getShape().toString() + System.lineSeparator() +
				"		   category: " + this.getCategory() + System.lineSeparator() +
				"		   size: " + this.getSize() + System.lineSeparator() +
				"=====================================" + System.lineSeparator();
	} 

	private void setShape(BodyShape bodyShape) {
		this.shape = bodyShape;
	}

	private void setCategory(char c) {	
		this.category = c;
	}

	private void setSize(int size) {
		this.size = size;
	}

	public void setType(BodyType type) {
		this.type = type;
	}

	public Character getCategory() {
		return category;
	}

	public void setCategory(Character category) {
		this.category = category;
	}

	public BodyShape getShape() {
		return shape;
	}

	public BodyType getType() {
		return type;
	}

	public int getSize() {
		return size;
	}
}
