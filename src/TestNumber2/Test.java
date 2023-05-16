package TestNumber2;

public class Test {
    public static void main(String[] args) throws MyNewException {
        testExp();
    }

    public static void testExp() throws MyNewException {
        throw new MyNewException();
    }
}
