package TestNumber27;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        DynamicArray<Integer> values = new DynamicArray<>();
        for (int i = 1; i <= 8; i++) {
            values.add(i);
        }
        for (int i = 0; i < values.size; i++) {
            System.out.print(values.get(i) + " ");
        }
        System.out.println("\n" + values.get(3));
        values.remove(5);
        for (int i = 0; i < values.size; i++) {
            System.out.print(values.get(i) + " ");
        }
    }

    public static class DynamicArray<T> {
        private int size;
        private T[] values = (T[]) new Object[10];

        public void add(T el) {
            if (size == values.length) {
                values = Arrays.copyOf(values, values.length + 1);
            }
            values[size++] = el;
        }

        public void remove(int index) {
            if (index >= size || index < 0) {
                throw new ArrayIndexOutOfBoundsException();
            }
            System.arraycopy(values, index + 1, values, index, values.length - 1 - index);
            size--;
        }

        public T get(int index) {
            if (index >= size || index < 0) {
                throw new ArrayIndexOutOfBoundsException();
            }
            return values[index];
        }
    }
}