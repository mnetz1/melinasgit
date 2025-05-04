package a1;

public class Milk extends PopularGrocery{

	public Milk(int quantity, int discountThreshold, int popularityLevel) {
		super(discountThreshold, 20, popularityLevel);
		
		//this.discountThreshold = discountThreshold; im super()
		
		//this.quantity = quantity;
		setQuantity(quantity);
		
		//this.householdLimit = 20; im super()
	}

	@Override
	public int getBulkDiscount() {
	if (getQuantity() >= getDiscountThreshold()) {
		return 12;
	}
	return 0;
	}

}
