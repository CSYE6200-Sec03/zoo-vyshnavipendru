package edu.neu.csye6200;

public class Zoo {

	public static void demo() {
		
		demoInterfaces();
		demoAbstract();
		demoConcrete();
	}
	
	public static void demoInterfaces() {
		
		StringBuilder sb= new StringBuilder();
		
		Frog frog=new Frog();
		frog.toString();
		
		Salamanders salamanders=new Salamanders();		
		salamanders.toString();
		
		Newts newts= new Newts();
		newts.toString();		
		
		System.out.println(sb.toString() );
		System.out.println(frog.toString());
		System.out.println(salamanders.toString());
		System.out.println(newts.toString());
		
		
	}
	
	public static void demoAbstract() {
		
	StringBuilder sb= new StringBuilder();
	
	Opahs opahs=new Opahs();
	opahs.toString();
	
	
	Goldfishes goldfishes=new Goldfishes();
	goldfishes.toString();		
	
	Pufferfish pufferfish= new Pufferfish();
	pufferfish.toString();

	System.out.println(sb.toString());
	System.out.println(opahs.toString());
	System.out.println(goldfishes.toString());
	System.out.println(pufferfish.toString());
	}
	
	public static void demoConcrete() {
		
		StringBuilder sb= new StringBuilder();
		
		Snake snake= new Snake();
		snake.toString();
		
		Crocodile crocodile= new Crocodile();
		crocodile.toString();
	
		Tortoise tortoise= new Tortoise();
		tortoise.toString();
		
	
		System.out.println(sb.toString());
		System.out.println(snake.toString());
		System.out.println(crocodile.toString());
		System.out.println(tortoise.toString());
	}
	
}
