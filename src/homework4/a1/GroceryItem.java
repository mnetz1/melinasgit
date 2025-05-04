package a1;

public abstract class GroceryItem extends Article {

	private boolean isPopular;
	
	public GroceryItem(int discountThreshold, int householdLimit) {
	super(discountThreshold, householdLimit);
	}

	public boolean isPopular() {
		return isPopular;
	}

	public void setPopular(boolean isPopular) {
		this.isPopular = isPopular;
	}

}
