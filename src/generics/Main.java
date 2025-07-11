package generics;

public class Main {
    static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>();
        pair.setFirst(10);
        pair.setSecond("Hello");
        System.out.println(pair);

        Pair.printVariable("hey");
    }
}
