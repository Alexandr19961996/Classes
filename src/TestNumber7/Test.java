package TestNumber7;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test {

    public static void main(String[] args) throws IOException {

        byte[] myArray = {1, 2, 7, 4};
        InputStream in = new ByteArrayInputStream(myArray);
        System.out.println(sumOfStream(in));
    }

    public static int sumOfStream(InputStream inputStream) throws IOException {
        int result = 0;
        while (inputStream.available() > 0) {
            result += (byte) inputStream.read();
        }
        return result;
    }
}