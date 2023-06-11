package TestNumber24;

import java.math.BigInteger;
import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }

    public static BigInteger factorial(int value) {
        if (value < 2) {
            return BigInteger.valueOf(1);
        } else {
            return IntStream.rangeClosed(2, value).mapToObj(BigInteger::valueOf).reduce(BigInteger::multiply).get();
        }
    }
}
