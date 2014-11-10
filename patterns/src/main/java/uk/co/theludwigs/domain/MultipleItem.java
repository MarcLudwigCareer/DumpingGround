package uk.co.theludwigs.domain;

public class MultipleItem extends OrderItem {
    // Returns the cost with profit margin minus discount
    public float getPriceWithDiscount() {
        float price = cost * getProfitMargin();
        return price - (price * getDiscount());
    }

    private float getDiscount() {
//        .... getDiscount logic goes here ....
    	return 0f;
    }
}
