package org.heikkila;

import dnd.randomizer.Choice;
import dnd.randomizer.RandomData;  

public class MainApp {
    public static void main(String[] args) {
        //Tarkista onko persistentti� dataa
    			// Luo uutta dataa tarvittaessa
    	RandomData dungeon = new RandomData(Choice.DUNGEON);
    	dungeon.create(dungeon.create()); 

    	RandomData ships = new RandomData(Choice.SHIPS);
    	ships.create();
    	
    	RandomData character = new RandomData(Choice.NPC);
    	character.create();
    	
    	RandomData sphere = new RandomData(Choice.CRYSTAL_SPHERE);
    	sphere.create();
    }
}