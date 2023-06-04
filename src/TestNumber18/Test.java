package TestNumber18;

import java.util.function.UnaryOperator;

public class Test {
    public static void main(String[] args) {
        Test test = new Test(); //ваш класс
        UnaryOperator<Integer> unaryOperator = test.sqrt();
        System.out.println("2 -> " + unaryOperator.apply(2));
        System.out.println("-4 -> " + unaryOperator.apply(-4));
        System.out.println("6 -> " + unaryOperator.apply(6));
        System.out.println("12 -> " + unaryOperator.apply(12));
    }

    public UnaryOperator<Integer> sqrt() {
        return x -> x * x;
    }
}
