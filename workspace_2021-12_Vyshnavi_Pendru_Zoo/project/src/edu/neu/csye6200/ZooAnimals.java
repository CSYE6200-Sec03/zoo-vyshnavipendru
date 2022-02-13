package edu.neu.csye6200;

public class ZooAnimals {

	String name;
//Reptiles
	public String breathe() {
		String b = "I breathe through lungs";
		return b;
	}

	public boolean isColdblooded(String animalName) {

		boolean isColdblooded = false;
		switch (animalName) {
		case "Crocodile":
			isColdblooded = true;
			break;
		case "Snake":
			isColdblooded = true;
			break;
		default:
			isColdblooded = false;
		}

		return isColdblooded;
	}

	public boolean isAmphibian(String animalName) {

		boolean isAmphibian = false;
		switch (animalName) {
		case "Crocodile":
			isAmphibian = true;
			break;
		case "Snake":
			isAmphibian = true;
			break;
		default:
			isAmphibian = false;
		}

		return isAmphibian;
	}

	public String animalName() {
		return name;
	}


	
}
