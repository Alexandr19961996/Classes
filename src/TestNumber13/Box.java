package TestNumber13;

public class Box<T> {
    private T object;

    public static <T> Box<T> getBox() {
        return new Box<T>();
    }
}
