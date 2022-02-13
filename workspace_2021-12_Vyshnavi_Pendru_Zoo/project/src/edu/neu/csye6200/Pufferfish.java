package edu.neu.csye6200;

public class Pufferfish extends ZooAbstractAnimals {

	public String name = "Pufferfish";
	public String breathe() {
		String b = "I breathe through gills.";
		return b;
	}

	@Override
	public boolean isColdblooded(String animalName) {
		// TODO Auto-generated method stub
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
		
		sb.append("Animal: ").append(this.animalName()).append("\n").append(this.breathe()).append("\n")
		.append("Is cold-blooded? ").append(this.isColdblooded("Pufferfish")).append("\n").append(this.habitat()).append("\n\n");
		
		return sb.toString();
	}
	
}
