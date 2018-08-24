package staticPolymorphism;

public class Salary {
	// static polymorphism achieve by method overloading.
	// using compile time to run the method
	
	public Salary() {
		System.out.println("static polymorphism example");
	}
	
	public void getSalary(int main) {
		System.out.println("main salary "+ main);
	}
	
	public void getSalary(int main, int allowance) {
		System.out.println("+ allowance "+ (main+allowance));
	}
	
	public void getSalary(int main, int allowance, int bonus) {
		System.out.println("+ allowance + bonus "+ (main+allowance+bonus));
	}
}
