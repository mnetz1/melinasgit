package a2;

public class Truck extends Vehicle implements Refuelable { //nur einmal extends möglich

	double fuelLevel;
	
	public Truck(String id, double maxLoad) {
		this.id = id;
		this.maxLoad = maxLoad;
		this.fuelLevel = maxLoad;
	}

	@Override
	public void refuel(double liters) {
		fuelLevel += liters;
	}

	@Override
	public double getFuelLevel() {
		return fuelLevel;
	}

	@Override
	public double getRange() {
	double km = fuelLevel % 0.3;
	return km;
	}

	@Override
	double fuelNeeded(double distance) {
		if (canReach(distance) == true) {
			return 0;
		} else {
			
		}
	}

}
