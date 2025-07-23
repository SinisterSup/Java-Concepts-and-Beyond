package generics.InventoryLab;

import java.util.PriorityQueue;
import java.util.Queue;

public class OrderProcessor {
    private final Queue<Order> orderQueue;
    public OrderProcessor() {
        this.orderQueue = new PriorityQueue<>();
    }

    public Order processOrder() {
        return orderQueue.poll();
    }
    public void addOrder(Order order) {
        orderQueue.add(order);
    }
}
