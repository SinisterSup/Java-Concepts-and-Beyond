package streams;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(List.of(13, 5, 9, -3, 7, 4, -8, 0, 3, 2, 12, 1, 4));
//        List<Integer> evenFiltered = arr.stream().filter(new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer % 2 == 0;
//            }
//        }).toList();
        List<Integer> evenFiltered = arr.stream().filter(x -> x % 2 == 0).toList();
        List<Integer> positiveOddFiltered = arr.stream().filter(x -> (x > 0) && (x % 2 == 1)).toList();
        List<Integer> oddRupeeConversion = positiveOddFiltered.stream().map(x -> x * 82).toList();
        List<Integer> evenRupeeConversion = arr.stream()
                        .filter(x -> x % 2 == 0)
                        .map(x -> x * 82)
                        .toList();

        List<String> processed = arr.stream()
                .filter(x -> x % 2 == 0)
                .map(new Function<Integer, Integer>() {
                    @Override
                    public Integer apply(Integer integer) {
                        return integer * 100;
                    }
                })
                .map(Object::toString)
                .sorted()
                .distinct()
//                .findAny()  // terminal operation (just like toList)
                .toList();

        Integer totalOddEleRupees = oddRupeeConversion.stream()
                    .sorted()
                    .distinct()
//                    .reduce(0, (x, y) -> x + y);
                    .reduce(0, Integer::sum);

        System.out.println(oddRupeeConversion);
        System.out.println(evenRupeeConversion);
        System.out.println(processed);
        System.out.println(totalOddEleRupees);
    }
}
