package org.heikkila;

public class CommonMethods {
	public static int randomInt(int floor, int ceiling) {
		int range = ceiling - floor;
		return (int)(range * Math.random() + floor);
	}
}
