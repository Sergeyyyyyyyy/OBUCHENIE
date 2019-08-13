import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.*;
import java.util.stream.Collectors;


public class ZadachaBAnalyse {
    public static void main(String[] args) {
        Analyse analizTest = new Analyse(System.in);


//        Analyse analizTest;
//        analizTest = new Analyse(new ByteArrayInputStream((
           // CASE 1:
//                "8\n" +
//                        "3 bread butter milk\n" +
//                        "5 cherry apple yogurt bread curd\n" +
//                        "4 milk tea shampoo washingpowder\n" +
//                        "4 soap bread meat peach\n" +
//                        "2 bread cucumber\n" +
//                        "3 radish curd milk\n" +
//                        "4 yogurt peach chocolate puff\n" +
//                        "3 butter lemon cucumber\n").getBytes()));
//        // CASE 2:
//        Analyse analizTest = new Analyse(new ByteArrayInputStream(("2\n" +
//                "        1 milk\n" +
//                "        1 meat").getBytes()));

        analizTest.print();

        // 1 2 2 6 2 2 2 5 3 3
    }
}
class Analyse {

    private Map<String, PokupkaStat> posesheniy = new LinkedHashMap<>(100);

    Analyse(InputStream in) {
        Scanner sc = new Scanner(in);
        calcposecheniyMagazinaCount(sc);
        sc.close();
    }

    private void calcposecheniyMagazinaCount(Scanner sc) {
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int pi = sc.nextInt();
            for (int j = 0; j < pi; j++) {
                String pokupka = sc.next();
                int step = i + 1;
                posesheniy.putIfAbsent(pokupka, new PokupkaStat(step));
                posesheniy.computeIfPresent(pokupka, (p, s) -> s.update(step));
            }
        }

    }
    void print() {
        List<Map.Entry<String, PokupkaStat>> output = posesheniy.entrySet().stream()
                .filter(e -> e.getValue().getCount() > 1)
                .sorted(Comparator.comparing(Map.Entry::getKey))
                .collect(Collectors.toList());
        System.out.println(output.size());
        output.forEach(e -> System.out.println(e.getKey() + " " + e.getValue().getMinDistance()));
    }
}

class PokupkaStat {
    private int lastN;
    private int minDistance;
    private int count;

    public PokupkaStat(int lastN) {
        this.lastN = lastN;
        this.minDistance = Integer.MAX_VALUE;
    }

    public int getLastN() {
        return lastN;
    }

    public void setLastN(int lastN) {
        this.lastN = lastN;
    }

    public int getMinDistance() {
        return minDistance;
    }

    public void setMinDistance(int minDistance) {
        this.minDistance = minDistance;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public PokupkaStat update(int n) {
        count++;
        if (count > 1) {
            minDistance = Math.min(n - lastN, minDistance);
            lastN = n;
        }
        return this;
    }
}
