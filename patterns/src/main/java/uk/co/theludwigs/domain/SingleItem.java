package uk.co.theludwigs.domain;

public class SingleItem extends OrderItem {

	@Override
	public float getPrice() {
	     return cost * getProfitMargin();
	}
}

