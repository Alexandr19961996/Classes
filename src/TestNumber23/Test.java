package TestNumber23;

import java.io.IOException;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) throws IOException {
        new Scanner(System.in).useDelimiter("(?U)[^\\p{L}\\p{Digit}]+").
                tokens().map(String::toLowerCase).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().
                sorted(Map.Entry.<String, Long>comparingByValue().reversed().thenComparing(Map.Entry.comparingByKey())).
                limit(10).map(Map.Entry::getKey).forEach(System.out::println);
    }
}
