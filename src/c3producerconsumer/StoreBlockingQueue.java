package c3producerconsumer;

import java.util.concurrent.ArrayBlockingQueue;

public class StoreBlockingQueue {
    int maxSize;
    ArrayBlockingQueue<Object> items;
//    List<Object> items;

    public StoreBlockingQueue(int maxSize) {
        this.maxSize = maxSize;
//        this.items = new ArrayList<>();
        this.items = new ArrayBlockingQueue<>(maxSize);
    }

    public void addItem(Object newItem) {
        items.add(newItem);
        System.out.println("Producer produced the item: " + newItem);
    }

    public void removeItem() {
//        items.remove(object);
//        items.poll();
//        System.out.println("Consumer consumed an item: " + items.removeLast());
        System.out.println("Consumer consumed an item: " + items.poll());
    }
}