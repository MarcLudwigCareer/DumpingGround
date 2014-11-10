package uk.co.theludwigs.actions;

import java.util.Collection;

import uk.co.theludwigs.domain.BonusItem;
import uk.co.theludwigs.domain.MultipleItem;
import uk.co.theludwigs.domain.Order;
import uk.co.theludwigs.domain.OrderItem;
import uk.co.theludwigs.domain.SingleItem;

public class Submitter {
	public void submitOrder(Collection<OrderItem> orderItems) {
        final Order order = new Order();

        for(OrderItem item : orderItems) {
            if (item instanceof SingleItem) {
                float price = ((SingleItem) item).getPriceNoDiscount();

                order.addItem(item.getKey(), price);
            }
            else if (item instanceof MultipleItem) {
                float price = ((MultipleItem) item).getPriceWithDiscount();

                order.addItem(item.getKey(), price);
            }
            else if (item instanceof BonusItem) {
                // Customer gets a bonus item with their order, no charge
                float price = ((BonusItem) item).getBonusPrice();

                order.addItem(item.getKey(), price);
            }
        }

        order.complete();
    }
}
