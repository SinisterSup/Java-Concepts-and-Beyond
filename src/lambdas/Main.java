package lambdas;

import java.lang.invoke.CallSite;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;

public class Main {
    static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World");
                System.out.println(Thread.currentThread().getName());
                System.out.println("The implementation is inside the anonymous class");
            }
        };
        // Java compiler knows that the Runnable interface has only one method named run.

        Runnable runnable2 = () -> {
            System.out.println("Hello World");
            System.out.println(Thread.currentThread().getName());
            System.out.println("The implementation is inside the lambda expression");
        };
        Runnable runnableLambda = () -> { System.out.println("Runnable from a lambda expression"); };

        // Callable is a functional interface that returns a value, which has only one method named call.
        Callable<String> callableLambda = () -> { return "This is a string returned by callable from a lambda expression"; };

        // Returns a random number between 0 and 99;
        Callable<Integer> callableRandom = () -> (int)(Math.random() * 100);

        // Comparator is a functional interface that compares two objects of the same type.
        // It has only one method named compare.
        Comparator<Integer> descComparatorLambda = (a, b) -> {
            return b.compareTo(a);
//            if (a > b) return -1;
//            else if (a < b) return 1;
//            else return 0;
        };

        // Other Comparator Examples
        Comparator<String> stringComparatorLambda = (s1, s2) -> s1.compareTo(s2);
        // Comparator<String> stringComparator = String::compareTo;
        Comparator<Integer> integerComparatorLambda = (i1, i2) -> i1.compareTo(i2);
        // Comparator<Integer> integerComparator = Integer::compareTo;


        List<Integer> arr = new ArrayList<>(List.of(13, 5, 9, -3, 7, 4, -8, 0));
//        // To sort an arrayList normally using the Collections.sort method.
//        Collections.sort(arr);
//        System.out.println(arr);

        // To sort an arrayList using a lambda expression., in alphabetical/lexicographical order.
        arr.sort((a, b) -> {
            String aStr = a.toString();
            String bStr = b.toString();
            return aStr.compareTo(bStr);
        });
        System.out.println(arr);

    }
}
