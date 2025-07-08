package c3producerconsumer;

public class Producer implements Runnable {
    private final Store store;

    public Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while (true) {
            // only one thread can access Store resources
            synchronized (store) {  // store.lock();
                if (store.items.size() < store.maxSize) {
                    store.addItem(new Object());
                }
            }  // store.unlock();
        }
//        while (true) {
//            if (store.items.size() < store.maxSize) {
//                store.addItem(new Object());
//            }
//        }
    }
}