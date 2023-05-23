package TestNumber8;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        byte[] myArray = {1, 2, 7, 4};
        InputStream in = new ByteArrayInputStream(myArray);
        OutputStream out = new ByteArrayOutputStream();
        print(in, out);
    }

    public static void print(InputStream inputStream, OutputStream outputStream) throws IOException {
        int result;
        while (inputStream.available() > 0) {
            result = (byte) inputStream.read();
            if (result % 2 == 0) {
                outputStream.write(result);
            }
        }
        outputStream.flush();
    }
}
