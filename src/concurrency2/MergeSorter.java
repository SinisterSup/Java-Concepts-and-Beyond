package concurrency2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public class MergeSorter implements Callable<List<Integer>> {
    private final List<Integer> integerList;

    public MergeSorter(List<Integer> integerList) {
        this.integerList = integerList;
    }

    public List<Integer> sort() {
        System.out.printf("Sorting %s on Thread %s\n", integerList, Thread.currentThread().getName());
        if (integerList.size() <= 1) return integerList;
        int mid = (integerList.size()) / 2;
        List<Integer> leftList = integerList.subList(0, mid);
        List<Integer> rightList = integerList.subList(mid, integerList.size());

        MergeSorter mergeSorterLeft = new MergeSorter(leftList, executorService);
        MergeSorter mergeSorterRight = new MergeSorter(rightList, executorService);

        List<Integer> sortedLeft = mergeSorterLeft.sort();
        List<Integer> sortedRight = mergeSorterRight.sort();

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
