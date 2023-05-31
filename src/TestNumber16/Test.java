package TestNumber16;

import java.io.Reader;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Reader reader = new StringReader("Алексей 3000\n" + "Дмитрий 9000\n" + "Антон 3000\n" + "Алексей 7000\n" + "Антон 8000");
        System.out.println(getSalesMap(reader));
    }

    public static Map<String, Long> getSalesMap(Reader reader) {
        Map<String, Long> map = new HashMap<>();
        Scanner line = new Scanner(reader);
        while (line.hasNext()) {
            map.merge(line.next(), line.nextLong(), Long::sum);
        }
        return map;
    }
}
