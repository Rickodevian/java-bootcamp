package staticPolymorphism;

import dynamicPolymorphism.*;

public class Main {
	public static void main(String[] args) {
		Salary salary = new Salary();
		salary.getSalary(10000);
		salary.getSalary(10000, 20000);
		salary.getSalary(10000, 20000, 30000);
		
		Bike bike = new Bike();
		bike.ride();
		//at compile time, it check on ride() in Bike Class, but in runtime, it invoke ride() in MountainBike Class.
		// also known as virtual method (invocation) or upcasting
		Bike bike2 = new MountainBike();
		bike2.ride();
		Bike bike3 = new RoadBike();
		bike3.ride();
		
		//multilevel inheritance, will print roadbike instead of fixbike if fixBake class
		// not implement overriden method (ride method)
		Bike bike4 = new fixBike();
		bike4.ride();
	}
}
