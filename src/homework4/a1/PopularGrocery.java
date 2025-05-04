package a1;

public abstract class PopularGrocery extends GroceryItem {
	
	private int popularityLevel;
	private int quantity;

	
	public PopularGrocery(int discountThreshold, int householdLimit, int popularityLevel) {
		// super(discountThreshold, householdLimit, isPopular); isPopular soll = true sein, deswegen unnötig im Konstruktor
		super(discountThreshold, householdLimit);
		setPopular(true); //setzt isPopular = true über Setter
		setPopularityLevel(popularityLevel);
	}

//Getter & Setter
	public int getPopularityLevel() {
		return popularityLevel;
	}


	public void setPopularityLevel(int popularityLevel) {
		this.popularityLevel = popularityLevel;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
//aktrakte Methode überschreiben 
	@Override
	public boolean showWarning() {
		if (getQuantity() > getHouseholdLimit()) {
			return true;
		}
		return false;
	}
	

}
