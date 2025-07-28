package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LazyEvalDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "Charlie", "Bob");

        System.out.println("=== Using findAny without sorted() ===");
        Optional<String> aNames = names.stream()
                .filter(name -> {
                    System.out.println("Filtering: " + name);
                    return name.startsWith("A");
                })
                .map(name -> {
                    System.out.println("Mapping: " + name);
                    return name.toUpperCase();
                })
                .findAny();

        System.out.println("Result1: " + aNames.orElse("No Match found"));

        System.out.println("=== Using findAny with sorted() ===");
        Optional<String> acNamesSorted = names.stream()
                .filter(name -> {
                    System.out.println("Filtering: " + name);
                    return name.startsWith("A") ||  name.startsWith("C");
                })
                .sorted((a, b) -> {
                    System.out.println("Sorting: " + a + " vs " + b);
                    return a.compareTo(b);
                })
                .map(name -> {
                    System.out.println("Mapping: " + name);
                    return name.toUpperCase();
                })
                .findAny();

        System.out.println("Result2: " + acNamesSorted.orElse("No Match found"));
    }
}
