package adderSubtractor;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {

    int i = 0;
//    AtomicInteger i = new AtomicInteger(0);

//    void increment() {
//        synchronized (this) {
//            i += 1;
//        }
//    }
    synchronized void increment() {
        i += 1;
    }

    void decrement() {
        synchronized (this) {
            i -= 1;
        }
    }
}
