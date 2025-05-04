package a1;

public class Flour extends PopularGrocery{

	public Flour(int quantity, int discountThreshold, int popularityLevel) {
		super(discountThreshold, 15, popularityLevel);
		setQuantity(quantity);
	}

	@Override
	public int getBulkDiscount() {
		if (getQuantity() >= getDiscountThreshold()) {
			return 5;
		}
		return 0;
	}

}
