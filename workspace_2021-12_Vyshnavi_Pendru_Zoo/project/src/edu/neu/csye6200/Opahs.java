package edu.neu.csye6200;

public class Opahs extends ZooAbstractAnimals {

	public String name = "Opahs";
	public String breathe() {
		String b = "I breathe through gills.";
		return b;
	}

	@Override
	public boolean isColdblooded(String animalName) {
		
		return super.isColdblooded(animalName);
	}

	@Override
	public String habitat() {
		// TODO Auto-generated method stub
		return super.habitat();
	}
	
	public String animalName() {
		return name;
	}

	@Override
	public String toString() {
		
		StringBuilder sb= new StringBuilder();
		
		sb.append("Animal:").append(this.animalName()).append("\n").append(this.breathe()).append("\n")
		.append("Is cold-blooded? ").append(this.isColdblooded("Opahs")).append("\n").append(this.habitat()).append("\n\n");
		
		return sb.toString();
	}
	
}
