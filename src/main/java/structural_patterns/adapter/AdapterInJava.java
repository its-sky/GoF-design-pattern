package structural_patterns.adapter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class AdapterInJava {

    public static void main(String[] args) {
        // collections
        List<String> list = Arrays.asList("a", "b", "c");
        Enumeration<String> enumeration = Collections.enumeration(list);
        ArrayList<String> list1 = Collections.list(enumeration);

        // io
        try (InputStream is = new FileInputStream("input.txt")) {
            InputStreamReader reader = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(reader);
            while (br.ready()) {
                System.out.println(br.readLine());
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

}
