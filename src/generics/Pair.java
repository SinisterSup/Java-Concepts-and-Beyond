package generics;

public class Pair<First, Second> {
    private First first;
    private Second second;

    public First getFirst() {
        return first;
    }
    public void setFirst(First first) {
        this.first = first;
    }
    public Second getSecond() {
        return second;
    }
    public void setSecond(Second second) {
        this.second = second;
    }

    static <T> T printVariable(T variable) {
        System.out.println("Printing Variable: " + variable + " of type: " + variable.getClass().getName());
        return variable;
    }

    @Override
    public String toString() {
        return "Pair{" + "first=" + first + ", second=" + second + '}';
    }
}
