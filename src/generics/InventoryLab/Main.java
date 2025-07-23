package generics.InventoryLab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item(1, "Book", 100.0, 10);
        Item item2 = new Item(2, "Pen", 20.0, 2);
        Item item3 = new Item(3, "Pencil", 5.0, 1);

        List<Item> itemList = new ArrayList<>(List.of(item1, item2, item3));
        Collections.sort(itemList);
        System.out.println(itemList);

        Order order1 = new Order("123", Order.OrderType.STANDARD);
        Order order2 = new Order("234", Order.OrderType.EXPRESS);
        Order order3 = new Order("345", Order.OrderType.STANDARD);
        Order order4 = new Order("456", Order.OrderType.EXPRESS);

        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.addOrder(order1);
        orderProcessor.addOrder(order3);
        System.out.println(orderProcessor.processOrder());
        orderProcessor.addOrder(order2);
        orderProcessor.addOrder(order4);
        System.out.println(orderProcessor.processOrder());
        System.out.println(orderProcessor.processOrder());
    }
}
