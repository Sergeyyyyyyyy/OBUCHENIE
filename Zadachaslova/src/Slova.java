import java.util.*;

public class Slova {
    public static void main(String... args) {

    }
}

class SlovaTest {

    private int repeatedSlovaCount = 0;
    private List<List<String>> inputslova;
    private int repeatslovaCount;

    SlovaTest() {
        Scanner sc = new Scanner(System.in);
        int slovaCount = sc.nextInt();
        inputslova = new ArrayList<>(slovaCount);
        while (inputslova.size() < slovaCount) {
            int SlovaCount = sc.nextInt();
            List<String> slova = new ArrayList<>(SlovaCount);
            while (slova.size() < SlovaCount) {
                slova.add(sc.next());
            }
            inputslova.add(slova);
        }
        sc.close();
    }

    void calcRepeatedSlovaCount() {
        Set<String> usedSlova = new HashSet<>();
        for (List<String> slova : inputslova) {
            int i = 0;
            while (i < usedSlova.size() && !usedSlova.add(slova.get(i))) {
                i++;
            }
            if (i != usedSlova.size()) {
                repeatslovaCount += i;
            }
        }
    }

    void print() {
        System.out.println(repeatslovaCount);
        System.out.println(inputslova);
    }
}
