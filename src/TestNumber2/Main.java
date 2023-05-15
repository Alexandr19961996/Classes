package TestNumber2;

public class Main {
    public static void main(String[] args) throws MyNewException {
        MyNewException myNewException = new MyNewException();
        testExp();
    }

    public static void testExp() throws MyNewException {
        throw new MyNewException();
    }
}
