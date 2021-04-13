package dnd.tables;

import java.util.HashMap;
import java.util.Map; 

import org.heikkila.dnd.spelljammer.*;

public class ShipTypes {
	//NAME | SIZE | AC | HITPOINTS | ATTACKMODIFIER | RANGE | DAMAGE | IDEALCREW | COST | NOTES
	 Map<Integer, Ship> resultTable = new HashMap<Integer, Ship>() {
			private static final long serialVersionUID = -1566577887286456816L;
	{ 
		put(1, new Ship("Flitter", "10,000 gp", 1,1, 1, 14, 40, 0, "20 ft / 6.1 m", "5 ft / 1.5m",  shipWeapons.getRandomLargeWeapons(0), new HelmTypes[] {HelmTypes.MINOR, HelmTypes.MAJOR}));
		put(2, new Ship("Mosquito", "15,000 gp", 1,6, 2, 17, 75, 10, "100 ft / 30.5 m", "15 ft / 4.6 m",  shipWeapons.getRandomLargeWeapons(0), new HelmTypes[] {HelmTypes.MINOR, HelmTypes.MAJOR}));
		put(3, new Ship("Caravel", "10,000 gp", 8, 10, 5, 13, 75, 10, "70 ft / 21.3 m", "20 ft / 6.1 m", shipWeapons.getRandomLargeWeapons(1) , new HelmTypes[] {HelmTypes.MINOR, HelmTypes.MAJOR}));
		put(4, new Ship("Dragonfly", "40,000 gp", 3, 10, 2, 14, 100, 10, "100 ft / 30.5 m", "20 ft / 6.1 m",  shipWeapons.getRandomMediumWeapons(1), new HelmTypes[] {HelmTypes.MINOR, HelmTypes.MAJOR}));
		put(5, new Ship("Damselfly", "50,000 gp", 2, 10, 3, 18, 100, 10, "100 ft / 30.5 m", "20 ft / 6.1 m",  shipWeapons.getRandomHugeWeapons(1), new HelmTypes[] {HelmTypes.MINOR, HelmTypes.MAJOR}));
		put(6, new Ship("Wasp", "20,000 gp", 8, 18, 3, 16, 150, 15, "80 ft / 24.4 m", "20 ft / 6.1 m", shipWeapons.getRandomHugeWeapons(1), new HelmTypes[] {HelmTypes.MINOR, HelmTypes.MAJOR})); 
		put(7, new Ship("Tradesman", "15,000 gp", 10, 25, 3, 17, 200, 20, "120 ft / 36.6 m", "30 ft / 9.1 m", shipWeapons.concat(shipWeapons.getRandomMediumWeapons(1), shipWeapons.getRandomLargeWeapons(1)), new HelmTypes[] {HelmTypes.MINOR, HelmTypes.MAJOR}));
		put(8, new Ship("Gnomish Sidewheeler", "40,000 gp", 20, 30, 4, 15, 250, 20, "120 ft / 36.6 m", "25 ft / 7.6 m", shipWeapons.getRandomLargeWeapons(0),new HelmTypes[] {HelmTypes.GNOMISH}));
		put(9, new Ship("Nautiloid", "40,000 gp", 10, 35, 3, 18, 300, 20, "180 ft / 54.9 m", "30 ft / 9.1 m", shipWeapons.getRandomLargeWeapons(5), new HelmTypes[] {HelmTypes.SERIES, HelmTypes.POOL}));
		put(10, new Ship("Mindspider", "60,000 gp", 3, 40, 2, 18, 400, 25, "40 ft / 12.2 m", "15 ft / 4.6 m", shipWeapons.getRandomLargeWeapons(3), new HelmTypes[] {HelmTypes.LIFEJAMMER}));
		put(11, new Ship("Galleon", "50,000 gp", 20, 40, 4, 15, 400, 25, "130 ft / 39.6 m", "30 ft / 9.1 m",  shipWeapons.concat(shipWeapons.getRandomMediumWeapons(1),shipWeapons.getRandomLargeWeapons(2)), new HelmTypes[] {HelmTypes.MINOR, HelmTypes.MAJOR}));
		put(12, new Ship("Squid Ship", "45,000 gp", 12, 45, 3, 17, 450, 25, "250 ft / 76.2 m", "25 ft / 7.6 m", shipWeapons.concat(shipWeapons.getRandomLargeWeapons(2),shipWeapons.getRandomHugeWeapons(1)), new HelmTypes[] {HelmTypes.MINOR, HelmTypes.MAJOR}));
		put(13, new Ship("Dragonship", "60,000 gp", 20, 45, 3, 17, 450, 25, "150 ft / 45.7 m", "20 ft / 6.1 m", shipWeapons.getRandomLargeWeapons(2), new HelmTypes[] {HelmTypes.MINOR, HelmTypes.MAJOR}));
		put(14, new Ship("Hammership", "50,000 gp", 24, 60, 3, 16, 550, 30, "250 ft / 76.2 m", "25 ft / 7.6 m",shipWeapons.getRandomHugeWeapons(3), new HelmTypes[] {HelmTypes.MINOR, HelmTypes.MAJOR}));
		put(15, new Ship("Man-o-War", "100,000 gp", 10, 60, 2, 15, 550, 30, "200 ft / 61 m", "20 ft / 6.1 m",shipWeapons.getRandomLargeWeapons(4), new HelmTypes[] {HelmTypes.MINOR, HelmTypes.MAJOR}));
		put(16, new Ship("Deathspider", "100,000 gp", 30, 100, 4, 17, 1000, 30, "175 ft / 53.3 m", "50 ft / 15.2 m", shipWeapons.getRandomHugeWeapons(6), new HelmTypes[] {HelmTypes.MAJOR}));
		put(17, new Ship("Armada", "125,000 gp", 40, 100, 3, 17, 1000, 30, "300 ft / 91.4 m", "30 ft / 9.1 m", shipWeapons.getRandomHugeWeapons(14), new HelmTypes[] {HelmTypes.MAJOR}));
		put(18, new Ship("Citadel", "1,000,000 gp", 100, 300, 4, 22, 2000, 30, "250 ft / 76.2 m", "200 ft / 61 m", shipWeapons.concat(shipWeapons.getRandomHugeWeapons(7), shipWeapons.getRandomLargeWeapons(8), shipWeapons.getRandomMediumWeapons(12)), new HelmTypes[] {HelmTypes.FORGE}));
		put(19, new Ship("Tyrant Ship", "1,000,000 gp", 100, 300, 4, 22, 2000, 30, "250 ft / 76.2 m", "200 ft / 61 m", shipWeapons.concat(shipWeapons.getRandomHugeWeapons(7), shipWeapons.getRandomLargeWeapons(8), shipWeapons.getRandomMediumWeapons(12)), new HelmTypes[] {HelmTypes.FORGE}));
		put(20, new Ship("Spelljammer", "1,000,000 gp", 100, 300, 4, 22, 2000, 30, "250 ft / 76.2 m", "200 ft / 61 m", shipWeapons.concat(shipWeapons.getRandomHugeWeapons(7), shipWeapons.getRandomLargeWeapons(8), shipWeapons.getRandomMediumWeapons(12)), new HelmTypes[] {HelmTypes.FORGE}));
		
    }};
    
    public Ship getShip(Integer pKey) {
    	return resultTable.get(pKey);  
    }
}