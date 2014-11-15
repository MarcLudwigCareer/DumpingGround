package uk.co.theludwigs.domain;

public abstract class OrderItem {
    protected String itemKey;
    protected float cost;
    
    public String getKey() {
        return itemKey;
    }  
    
    public abstract float getPrice();
    
    protected float getProfitMargin() {
//        .... getProfitMargin logic goes here ....
    	return 0f;
    }
}
