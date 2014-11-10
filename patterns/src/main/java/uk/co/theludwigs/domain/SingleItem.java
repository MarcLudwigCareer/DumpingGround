package uk.co.theludwigs.domain;

public class SingleItem extends OrderItem {
    // Returns the cost with profit margin
    public float getPriceNoDiscount() {
        return cost * getProfitMargin();
    }
}

