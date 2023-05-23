package TestNumber9;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Test {
    public static void main(String[] args) throws IOException {
        byte[] myArray = {48, 49, 50, 51};
        InputStream in = new ByteArrayInputStream(myArray);
        Charset charset = StandardCharsets.US_ASCII;
        System.out.println(readAsString(in, charset));
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset);
        StringBuilder line = new StringBuilder();
        int result;
        while ((result = inputStreamReader.read()) != -1) {
            line.append((char) result);
        }
        inputStreamReader.close();
        return line.toString();
    }
}
