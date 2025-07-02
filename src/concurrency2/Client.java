package concurrency2;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> nums = List.of(5, 2, 6, 1, 4, 7, 8, 3, 5, 4, 2, 3, 9);

//        // Normal mergeSort without multithreading
//        MergeSorter mergeSorter = new MergeSorter(nums);
//        List<Integer> sortedNums = mergeSorter.sort();
//        for (Integer num : sortedNums) {
//            System.out.printf("%d ", num);
//        }

        // implementing multi-threading mergeSort using fixedThreadPool
        ExecutorService executorService = Executors.newFixedThreadPool(13);
        MergeSorter mergeSorter = new MergeSorter(nums, executorService);
        Future<List<Integer>> listFuture = executorService.submit(mergeSorter);
        for (Integer num : listFuture.get()) {
            System.out.printf("%d ", num);
        }
        executorService.shutdown();

    }
}
