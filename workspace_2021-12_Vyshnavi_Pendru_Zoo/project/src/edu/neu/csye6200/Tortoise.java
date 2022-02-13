package edu.neu.csye6200;

public class Tortoise extends ZooAnimals{

public String name= "Tortoise";
	
	
	public String animalName() {
		// TODO Auto-generated method stub
		return name;
	}


	@Override
	public String toString() {
		
		StringBuilder sb= new StringBuilder();
		
		sb.append("Animal:").append(this.animalName()).append("\n").append(this.breathe()).append("\n")
		.append("Is cold-blooded? ").append(this.isColdblooded("Tortoise")).append("\n").append("Is Amphibian? ").append(this.isAmphibian("Tortoise")).append("\n\n");
		
		return sb.toString();
	}
	
	
}
