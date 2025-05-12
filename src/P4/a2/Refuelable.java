package a2;

public interface Refuelable {
	
	void refuel(double liters);
	
	double getFuelLevel();
	
	default boolean canReach(double distance) {
		return getRange() >= distance;
	}

}
