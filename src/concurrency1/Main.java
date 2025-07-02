package concurrency1;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        System.out.println("Hello World");
        Thread thread = Thread.currentThread();

        System.out.println(Thread.currentThread().getName());

        // Runnable Demo
        for  (int i = 0; i < 100; i++) {
            NumberPrinter numPrinter = new NumberPrinter(i);
//            numPrinter.run();
            Thread newThread = new Thread(numPrinter);
            newThread.start();
        }

        // Callable demo
        NumberDoubler numDoubler  = new NumberDoubler(100);
        ExecutorService fixedExecutorService = Executors.newFixedThreadPool(2);
        Future<Integer> integerFuture = fixedExecutorService.submit(numDoubler);

        do {
            Thread.sleep(200);
            System.out.println(integerFuture.isDone());
        } while (!integerFuture.isDone());

        // Blocking call -> Main thread won't proceed until
        // the thread completes execution for integer future.
        System.out.println(integerFuture.get());
        fixedExecutorService.shutdown();
    }
}
