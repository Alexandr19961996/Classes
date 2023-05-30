package TestNumber14;

public class Test {
    public static void main(String[] args) {
        Pair<Integer, String> pair = Pair.of(1, null);
        Integer i = pair.getFirst(); // 1
        System.out.println(i);
        String s = pair.getSecond(); // "hello"
        System.out.println(s);
        Pair<Integer, String> pair2 = Pair.of(1, null);
        boolean mustBeTrue = pair.equals(pair2); // true!
        System.out.println(mustBeTrue);
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode();
        System.out.println(mustAlsoBeTrue);
    }
}
