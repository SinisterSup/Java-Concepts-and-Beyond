package c3producerconsumer;

public class Consumer implements Runnable {
    private final Store store;

    public Consumer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while (true) {
            // only one thread can access Store resources
            synchronized (store) {  // store.lock();
                if (!store.items.isEmpty()) {
                    store.removeItem();
                }
            }  // store.unlock();
        }
//        while (true) {
//            if (!store.items.isEmpty()) {
//                store.removeItem();
//            }
//        }
    }
}
