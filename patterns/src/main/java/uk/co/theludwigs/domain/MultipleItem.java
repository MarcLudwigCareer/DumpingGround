package uk.co.theludwigs.domain;

public class MultipleItem extends OrderItem {
	
	@Override
	public float getPrice() {
        float price = cost * getProfitMargin();
        return price - (price * getDiscount());
	}

    private float getDiscount() {
//        .... getDiscount logic goes here ....
    	return 0f;
    }

}
