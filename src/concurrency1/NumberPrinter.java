package concurrency1;

public class NumberPrinter implements Runnable{
    int i;
    public NumberPrinter(int i) {
        this.i = i;
    }
    @Override
    public void run() {
        System.out.println("Thread: " + Thread.currentThread().getName() + ", prints number: " + i);
    }
}
