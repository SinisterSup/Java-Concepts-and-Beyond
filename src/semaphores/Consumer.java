package semaphores;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {
    Semaphore producerSemaphore;
    Semaphore consumerSemaphore;
    Store store;

    public Consumer(Store store, Semaphore producerSemaphore, Semaphore consumerSemaphore) {
        this.store = store;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }

    @Override
    public void run() {
        while (true) {
            try {
                consumerSemaphore.acquire();
                store.removeItem();
                producerSemaphore.release();
            }  catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}