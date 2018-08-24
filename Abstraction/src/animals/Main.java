package animals;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Frog frog = new Frog();
		frog.eyes = 2;
		frog.legs = 4;
		System.out.println("frog has "+frog.eyes+" eyes and "+frog.legs+" legs");
		frog.walk();
		frog.sound();
		frog.eat();
		frog.swim();
		frog.travel();
	}

}
