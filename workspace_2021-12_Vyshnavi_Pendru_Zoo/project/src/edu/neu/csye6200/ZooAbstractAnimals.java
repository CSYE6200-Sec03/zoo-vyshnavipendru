package edu.neu.csye6200;


public abstract class ZooAbstractAnimals {
	
	//Fishes
	public abstract  String breathe();

	public boolean isColdblooded(String animalName) {

		boolean isColdblooded = false;
		switch (animalName) {
		case "Opahs":
			isColdblooded = false;
			break;
		case "Goldfishes":
			isColdblooded = true;
			break;
		case "Pufferfish":
			isColdblooded = true;
			break;
		default:
			isColdblooded = false;
		}

		return isColdblooded;
	}

//Tortoises
	public String habitat() {
		String h = "I live in water.";
		return h;
		
	}
	
	public abstract String animalName();

}

