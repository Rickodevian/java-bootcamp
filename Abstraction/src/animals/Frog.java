package animals;

import animalInterface.*;

public class Frog extends Animal implements LiveInWaterInterface, LiveInLandInterface {
	public void sound() {
		System.out.println("Webek");
	}
	
	public void walk() {
		System.out.println("Hop! Hop!");
	}
	
	public void swim() {
		System.out.println("it can swim");
	}
	
	public void travel() {
		System.out.println("travel by hopings");
	}
}
