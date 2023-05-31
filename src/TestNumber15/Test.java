package TestNumber15;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Set.of(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Set.of(0, 1, 2));
        System.out.println(symmetricDifference(set1, set2));
    }

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> set1New = new HashSet<>(set1);
        Set<T> set2New = new HashSet<>(set2);
        set1New.removeAll(set2);
        set2New.removeAll(set1);
        set1New.addAll(set2New);
        return set1New;
    }
}
