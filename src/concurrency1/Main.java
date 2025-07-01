package concurrency1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Thread thread = Thread.currentThread();

        System.out.println(Thread.currentThread().getName());

        for  (int i = 0; i < 100; i++) {
            NumberPrinter numPrinter = new NumberPrinter(i);
//            numPrinter.run();
            Thread newThread = new Thread(numPrinter);
            newThread.start();
        }

    }
}
