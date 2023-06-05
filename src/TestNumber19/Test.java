package TestNumber19;

public class Test {

    @FunctionalInterface
    public interface NumberGenerator<T extends Number> {
        boolean cond(T arg);
    }

    public static void main(String[] args) {
        NumberGenerator<? super Number> numberGenerator = getGenerator();
        System.out.println(numberGenerator.cond(123456L));
        System.out.println(numberGenerator.cond(123456.56));
        System.out.println(numberGenerator.cond(132));
        System.out.println(numberGenerator.cond(Byte.MAX_VALUE));
        System.out.println(numberGenerator.cond(-5.5));
        System.out.println(numberGenerator.cond(-1253523525L));
        System.out.println(numberGenerator.cond(0));
        System.out.println(numberGenerator.cond(-2));
        System.out.println(numberGenerator.cond(Byte.MIN_VALUE));
    }

    public static NumberGenerator<? super Number> getGenerator() {
        return x -> x.intValue() > 0;
    }
}
