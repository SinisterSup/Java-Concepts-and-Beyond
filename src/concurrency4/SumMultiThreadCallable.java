package concurrency4;

import java.util.List;
import java.util.concurrent.Callable;

public class SumMultiThreadCallable implements Callable<Long> {
    public SumMultiThreadCallable(List<Integer> numList, int startIndx, int endIndx) {
        this.numList = numList;
        this.startIndx = startIndx;
        this.endIndx = endIndx;
    }

    private List<Integer> numList;
    private final int startIndx;
    private final int endIndx;

    public void setNumList(List<Integer> numList) {
        this.numList = numList;
    }
    public List<Integer> getNumList() {
        return this.numList;
    }
    public int getStartIndx() {
        return this.startIndx;
    }
    public int getEndIndx() {
        return this.endIndx;
    }

    public Long getSum() {
        if  (this.numList.isEmpty()) return 0L;
        Long sum = 0L;
        for (int i = this.startIndx; i < this.endIndx; i++) {
            sum += this.numList.get(i);
        }
        return sum;
    }

    @Override
    public Long call() throws Exception {
        Long subarrSum = getSum();
        System.out.println("Sum Calculated by  " + Thread.currentThread().getName() + ": " + subarrSum);
        return subarrSum;
    }
}
