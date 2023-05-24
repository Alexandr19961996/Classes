package TestNumber10;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;
        double result = 0d;
        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                line = scanner.next();
                result += Double.parseDouble(line);
            } else {
                scanner.next();
            }
        }
        scanner.close();
        System.out.printf("%.6f", result);
    }
}