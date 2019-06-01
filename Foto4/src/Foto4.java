import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Foto4 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = in.readLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int k = Integer.parseInt(firstLine[1]);

        Map<String, Integer> wordsTags = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] line = in.readLine().split(" ");
            for (int j = 1; j < line.length; j++) {
                String tag = line[j];
                Integer current = wordsTags.getOrDefault(tag,0);
                wordsTags.put(tag, current + 1);
            }
        }
        int count = 0;
        for (int value : wordsTags.values()) {
            if (value >= k) {
                count++;
            }
        }

        System.out.println(count);
    }
}

