package TestNumber21;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        pseudoRandomStream(13).limit(10).forEach(System.out::println);
    }

    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(seed, x -> (x * x / 10) % 1000);
    }
}
