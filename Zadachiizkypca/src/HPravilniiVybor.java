import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class HPravilniiVybor {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int n = Integer.parseInt(in.readLine());

        Map<String, Integer> successTime = new TreeMap<>(String::compareTo);
        for (int i = 0; i < n; i++) {
            String[] line = in.readLine().split(" ");
            String field = line[0];
            int time = Integer.parseInt(line[1]);
            successTime.compute(field, (key, value) -> (value == null) ? time : Math.min(value, time));
        }

        List<Map.Entry<String, Integer>> fields = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : successTime.entrySet()) {
            if (fields.size() == 0) {
                fields.add(entry);
            } else {
                int currentMin = fields.get(0).getValue();
                if (currentMin == entry.getValue()) {
                    fields.add(entry);
                } else if (currentMin > entry.getValue()) {
                    fields.clear();
                    fields.add(entry);
                }
            }
        }

        out.println(fields.size());
        out.println(fields.get(0).getValue());
        for (Map.Entry<String, Integer> entry : fields) {
            out.println(entry.getKey());
        }
        out.flush();
    }
}

