package TestNumber17;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] mass = scanner.nextLine().split(" ");
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < mass.length; i++) {
            if (i % 2 != 0) {
                deque.add(Integer.valueOf(mass[i]));
            }
        }
        StringBuilder result = new StringBuilder();
        while (deque.peekLast() != null) {
            result.append(deque.pollLast()).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}
