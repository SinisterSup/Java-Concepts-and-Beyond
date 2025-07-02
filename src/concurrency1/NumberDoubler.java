package concurrency1;

import java.util.concurrent.Callable;

public class NumberDoubler implements Callable<Integer> {
    private final int i;
    public NumberDoubler(int i) {
        this.i = i;
    }

    @Override
    public Integer call() throws Exception {
        return i * 2;
    }
}
