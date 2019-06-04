import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Session {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());

        Set<Integer> goodMethods = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int raw = Integer.parseInt(in.readLine());
            if (raw > 0) {
                goodMethods.add(raw);
            } else {
                goodMethods.remove(-raw);
            }
        }
        System.out.println(goodMethods.size());
    }
}
