package edu.neu.csye6200;

public class Crocodile extends ZooAnimals{

public String name= "Crocodile";
	
	
	public String animalName() {
		// TODO Auto-generated method stub
		return name;
	}


	@Override
	public String toString() {
		
		StringBuilder sb= new StringBuilder();
		
		sb.append("Animal:").append(this.animalName()).append("\n").append(this.breathe()).append("\n")
		.append("Is cold-blooded? ").append(this.isColdblooded("Crocodile")).append("\n").append("Is Amphibian? ").append(this.isAmphibian("Crocodile")).append("\n\n");
		
		return sb.toString();
	}
	
	
}
