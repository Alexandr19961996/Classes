package TestNumber23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = bufferedReader.readLine().toLowerCase();
        Stream<String> stream = Arrays.stream(line.split("(?U)[^\\p{L}\\p{Digit}]+"));
        Map<String, Long> map = stream.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        map.entrySet().stream().
                sorted(Map.Entry.<String, Long>comparingByValue().reversed().thenComparing(Map.Entry.comparingByKey())).limit(10).
                forEach(System.out::println);
    }
}
