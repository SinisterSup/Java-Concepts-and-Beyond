package c3producerconsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;

public class Store {
    int maxSize;
    List<Object> items;

    public Store(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ArrayList<>();
    }

    public void addItem(Object newItem) {
        items.add(newItem);
        System.out.println("Producer produced the item: " + newItem);
    }

    public void removeItem() {
//        items.remove(object);
        System.out.println("Consumer consumed an item: " + items.removeLast());
    }
}
