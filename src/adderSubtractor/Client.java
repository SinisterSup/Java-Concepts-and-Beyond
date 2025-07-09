package adderSubtractor;

public class Client {
    static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Adder adder = new Adder(counter);
        Subtractor subtractor = new Subtractor(counter);

        Thread adderThread = new Thread(adder);
        Thread subtractorThread = new Thread(subtractor);
        adderThread.start();
        subtractorThread.start();

        adderThread.join();
        subtractorThread.join();

        System.out.println(counter.i);
//        System.out.println(counter.i.get());
    }
}
