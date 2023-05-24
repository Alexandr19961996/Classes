package TestNumber11;

import java.io.*;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws IOException {
        byte[] data = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(byteArrayOutputStream);
            oos.writeInt(3);
            oos.writeObject(new Animal("Животное №1"));
            oos.writeObject(new Animal("Животное №2"));
            oos.writeObject(new Animal("Животное №3"));
            byteArrayOutputStream.flush();
            data = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Arrays.toString(data));
        System.out.println(Arrays.toString(deserializeAnimalArray(data)));
    }

    public static Animal[] deserializeAnimalArray(byte[] data) {
        Animal[] animal;
        try (ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data))) {
            animal = new Animal[ois.readInt()];
            for (int i = 0; i < animal.length; i++) {
                animal[i] = (Animal) ois.readObject();
            }
        } catch (IOException | ClassNotFoundException | ClassCastException | NegativeArraySizeException e) {
            throw new IllegalArgumentException(e);
        }
        return animal;
    }
}
