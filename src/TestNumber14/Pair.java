package TestNumber14;

import java.util.Objects;

public class Pair<T, M> {
    private T first;
    private M second;

    private Pair(T first, M second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public M getSecond() {
        return second;
    }

    public static <T, M> Pair<T, M> of(T first, M second) {
        return new Pair<>(first, second);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(first, pair.first) && Objects.equals(second, pair.second);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }
}
