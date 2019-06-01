import java.util.*;

public class Tram {
    public static void main(String... args) {
        TramsTest tramsTest = new TramsTest();
        tramsTest.calcSkippedTramsCount();
        tramsTest.print();
    }
}

class TramsTest {

    private int skippedTramsCount = 0;
    private final List<List<String>> inputData;

    TramsTest() {
        Scanner sc = new Scanner(System.in);
        int daysCount = sc.nextInt();
        inputData = new ArrayList<>(daysCount);
        while (inputData.size() < daysCount) {
            int tramsCount = sc.nextInt();
            List<String> trams = new ArrayList<>(tramsCount);
            while (trams.size() < tramsCount) {
                trams.add(sc.next());
            }
            inputData.add(trams);
        }
        sc.close();
    }

    void calcSkippedTramsCount() {
        Set<String> usedTrams = new HashSet<>();
        for (List<String> dayTrams : inputData) {
            int i = 0;
            while (i < dayTrams.size() && !usedTrams.add(dayTrams.get(i))) {
                i++;
            }
            if (i != dayTrams.size()) {
                skippedTramsCount += i;
            }
        }
    }

    void print() {
        System.out.println(skippedTramsCount);
    }
}