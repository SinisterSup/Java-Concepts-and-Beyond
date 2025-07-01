package concurrency1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {
    public static void main(String[] args) {
        ExecutorService fixedExecutorService = Executors.newFixedThreadPool(10);
        ExecutorService cachedExecutorService = Executors.newCachedThreadPool();

        for (int i = 0; i < 100; i++) {
            NumberPrinter numPrinter = new NumberPrinter(i);
//            fixedExecutorService.submit(numPrinter);
            cachedExecutorService.submit(numPrinter);
        }
//        fixedExecutorService.shutdown();
        cachedExecutorService.shutdown();

    }
}
