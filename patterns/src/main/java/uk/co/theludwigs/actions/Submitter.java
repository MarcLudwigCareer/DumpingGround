package uk.co.theludwigs.actions;

import java.util.Collection;

import uk.co.theludwigs.domain.Order;
import uk.co.theludwigs.domain.OrderItem;

public class Submitter {
	public void submitOrder(Collection<OrderItem> orderItems) {
        final Order order = new Order();

        for (OrderItem orderItem : orderItems) {
			order.addItem(orderItem.getKey(), orderItem.getPrice());
		}
        order.complete();
    }
}
