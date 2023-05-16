package TestNumber5;

public class Test {

    public static void main(String[] args) {
        try (Car car = new Car()) {
            car.drive();
        } catch (RuntimeException ignored) {
        }
    }

    static class Car implements AutoCloseable {
        public void close() {
            System.out.println("Машина закрывается...");
        }

        void drive() {
            System.out.println("Машина поехала.");
        }
    }
}