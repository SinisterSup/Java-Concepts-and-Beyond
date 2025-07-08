package c3producerconsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Store {
    int maxSize;
    List<Object> items;

    Lock lock;

    public Store(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ArrayList<>();
        this.lock = new ReentrantLock();
    }

    public void addItem(Object newItem) {
//        lock.lock();
        items.add(newItem);
//        lock.unlock();
        System.out.println("Producer produced the item: " + newItem +  " size=" + items.size());
    }

    public void removeItem() {
//        lock.lock();
        items.removeLast();
//        lock.unlock();
        System.out.println("Consumer consumed an item. size=" + items.size());
    }
}
