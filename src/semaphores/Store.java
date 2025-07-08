package semaphores;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Store {
    int maxSize;
    List<Object> items;

    public Store(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ArrayList<>();
    }

    public void addItem(Object newItem) {
        items.add(newItem);
        System.out.println("Producer produced the item: " + newItem +  " size=" + items.size());
    }

    public void removeItem() {
        items.removeLast();
        System.out.println("Consumer consumed an item. size=" + items.size());
    }
}
