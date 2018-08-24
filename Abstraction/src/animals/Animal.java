package animals;

public abstract class Animal {
	public int eyes;
	public int legs;
	
	protected void eat() {
		System.out.println("eat");
	}
	
	public abstract void sound();
	public abstract void walk();
}
