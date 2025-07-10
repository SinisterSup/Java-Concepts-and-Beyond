package concurrency4;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SumCalculation {
    public static void main(String[] args) {
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Available Processor cores: " + cores);

        ExecutorService fixedExecutorService = Executors.newFixedThreadPool(10);
        List<Future<Long>> futures = new ArrayList<>();

        List<Integer> arr =  new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            arr.add(i % 3);
        }
        int chunkSize = arr.size() / cores;
        int remaining = arr.size() % cores;

        for (int chunk = 0; chunk < cores; chunk++) {
            int start = chunk * chunkSize;
            int end = (chunk == cores - 1) ? arr.size() : (chunk + 1) * chunkSize;

            SumMultiThreadCallable subArrSumCallable = new SumMultiThreadCallable(
                    arr,
                    start,
                    end);
            Future<Long> subArrSum = fixedExecutorService.submit(subArrSumCallable);
            futures.add(subArrSum);
        }
        Long ans = futures.stream().map(future -> {
            try {
                return future.get();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        }).reduce(0L, Long::sum);

        fixedExecutorService.shutdown();
    }
}





//public class SumCalculation {
////    static void main(String[] args) {
////        int cores =  Runtime.getRuntime().availableProcessors();
////        System.out.println("Available Processor cores: " + cores);
////    }
//    public SumCalculation(List<Integer>numList, int startIndx, int endIndx) {
//        this.numList = numList;
//        this.startIndx = startIndx;
//        this.endIndx = endIndx;
//    }
//
//    private List<Integer> numList;
//    private final int startIndx;
//    private final int endIndx;
//
//    public void setNumList(List<Integer> numList) {
//        this.numList = numList;
//    }
//    public List<Integer> getNumList() {
//        return this.numList;
//    }
//    public int getStartIndx() {
//        return this.startIndx;
//    }
//    public int getEndIndx() {
//        return this.endIndx;
//    }
//
//    public int getSum() {
//        if (numList.size() == 0) {
//            return 0;
//        }
//        int sum = 0;
//        for (int i = this.startIndx; i <= this.endIndx; i++) {
//            sum += this.numList.get(i);
//        }
//        return sum;
//    }
//}
