package adderSubtractor;

public class Adder implements Runnable {
    Counter counter;
    public Adder(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
//            counter.i += i;
//            counter.i.incrementAndGet();
            synchronized (counter) {
                counter.i += i;
            }
        }
    }
}
