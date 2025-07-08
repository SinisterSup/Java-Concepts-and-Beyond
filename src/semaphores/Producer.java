package semaphores;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable {
    Semaphore producerSemaphore;
    Semaphore consumerSemaphore;
    Store store;

    public Producer(Store store, Semaphore producerSemaphore, Semaphore consumerSemaphore) {
        this.store = store;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }

    @Override
    public void run() {
        while (true) {
            try {
                producerSemaphore.acquire();
                store.addItem(new Object());
                consumerSemaphore.release();
            }  catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
