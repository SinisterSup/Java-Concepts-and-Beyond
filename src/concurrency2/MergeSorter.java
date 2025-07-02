package concurrency2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MergeSorter implements Callable<List<Integer>> {
    private final List<Integer> integerList;
    private final ExecutorService executorService;

//    public MergeSorter(List<Integer> integerList) {
//        this.integerList = integerList;
//    }
    public MergeSorter(List<Integer> integerList, ExecutorService executorService) {
        this.integerList = integerList;
        this.executorService = executorService;
    }

    public List<Integer> sort() throws ExecutionException, InterruptedException {
        System.out.printf("Sorting %s on Thread %s\n", integerList, Thread.currentThread().getName());
        if (integerList.size() <= 1) return integerList;
        int mid = (integerList.size()) / 2;
        List<Integer> leftList = integerList.subList(0, mid);
        List<Integer> rightList = integerList.subList(mid, integerList.size());

//        MergeSorter mergeSorterLeft = new MergeSorter(leftList);
//        MergeSorter mergeSorterRight = new MergeSorter(rightList);
        MergeSorter mergeSorterLeft = new MergeSorter(leftList, executorService);
        MergeSorter mergeSorterRight = new MergeSorter(rightList, executorService);


//        List<Integer> sortedLeft = mergeSorterLeft.sort();
//        List<Integer> sortedRight = mergeSorterRight.sort();

        // Instead of directly calling sort on the same thread,
        // Submit the task to the thread-pool via executorService
        // which in-turn schedules it on different threads.
        Future<List<Integer>> futureLeftList = executorService.submit(mergeSorterLeft);
        Future<List<Integer>> futureRightList = executorService.submit(mergeSorterRight);

        // Blocking call to get the sorted array halves.
        List<Integer> sortedLeft = futureLeftList.get();
        List<Integer> sortedRight = futureRightList.get();

        // merge sorted halves
        int i = 0, j = 0;
        List<Integer> mergedList = new ArrayList<>();
        while (i < sortedLeft.size() && j < sortedRight.size()) {
            if (sortedLeft.get(i) < sortedRight.get(j)) {
                mergedList.add(sortedLeft.get(i));
                i++;
            } else  {
                mergedList.add(sortedRight.get(j));
                j++;
            }
        }
        while (i < sortedLeft.size()) {
            mergedList.add(sortedLeft.get(i));
            i++;
        }
        while (j < sortedRight.size()) {
            mergedList.add(sortedRight.get(j));
            j++;
        }
        return  mergedList;
    }

    @Override
    public List<Integer> call() throws Exception {
        return sort();
    }
}
