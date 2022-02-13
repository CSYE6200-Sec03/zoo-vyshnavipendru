package edu.neu.csye6200;

public class Frog implements ZooAnamalisticAnimals {
	public String name = "Frog";
	
	
	@Override
	public String breathe() {
		String b = "I breathe through skin";
		return b;
	}
	@Override
	public boolean isColdblooded() {

		boolean isColdblooded = true;
		return isColdblooded;
	}
	@Override
	public String habitat() {
		return "I live both on land and water" ;
	}

	@Override
	public String animalName() {
		// TODO Auto-generated method stub
		return name;
	}
	@Override
	public String toString() {
		
		StringBuilder sb= new StringBuilder();
		
		sb.append("Animal:").append(this.animalName()).append("\n").append(this.breathe()).append("\n")
		.append("Is cold-blooded? ").append(this.isColdblooded()).append("\n").append(this.habitat()).append("\n\n");
		
		return sb.toString();
	}
	
	

}
