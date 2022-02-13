package edu.neu.csye6200;

public class Newts implements ZooAnamalisticAnimals {

	public String name = "Newts";

	public String breathe() {
		String b = "I breathe through skin";
		return b;
	}

	

	public boolean isColdblooded() {

		boolean isColdblooded = true;
		return isColdblooded;
	}

	public String habitat() {
		return " I live both on land and water";
	}

	@Override
	public String animalName() {
		return name;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb= new StringBuilder();
		
		sb.append("Animal: ").append(this.animalName()).append("\n").append(this.breathe()).append("\n")
		.append("Is cold-blooded? ").append(this.isColdblooded()).append("\n").append(this.habitat()).append("\n\n");
		
		return sb.toString();
	}
}
