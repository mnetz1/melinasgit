package a2;

public abstract class Vehicle {
	
	String id;
	double maxLoad;
	
	//Konstruktor:

	public abstract double getRange();
	abstract double fuelNeeded(double distance);
	

}
