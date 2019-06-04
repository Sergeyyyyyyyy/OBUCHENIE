import java.util.*;

public class Slova {
    public static void main(String... args) {
        SlovaTest slovo = new SlovaTest();
        slovo.calcDifficutSlovaCount();
        slovo.print();
    }
}

class SlovaTest {

    private int difficultSlovaCount = 0;
    private List<String> inputslova;
    private int repeatslovaCount = 0;
    private Set<String> result = new LinkedHashSet<> ();

    SlovaTest() {
        Scanner sc = new Scanner(System.in);
        int slovaCount = sc.nextInt();
        inputslova = new ArrayList<>(slovaCount);
        while (inputslova.size() < slovaCount) {
            String slova = sc.next ();
            inputslova.add(slova);
        }
        sc.close();
    }

    void calcDifficutSlovaCount() {
        TreeMap<String,Integer> repetedSlova = new TreeMap<> ();
        for (String slovo : inputslova) {
            Integer tekucheekolvo = repetedSlova.getOrDefault ( slovo, 0 );
            repetedSlova.put ( slovo, tekucheekolvo +1);
            if (tekucheekolvo + 1 > repeatslovaCount){
                repeatslovaCount = tekucheekolvo + 1;
            }
        }

        for (Map.Entry<String, Integer> slovo : repetedSlova.entrySet ()) {
            if (slovo.getValue () == repeatslovaCount) {
                result.add ( slovo.getKey () );
            }
        }
    }


    void print() {
        System.out.println(String.format ("%d %d", repeatslovaCount , result.size ()));
        for (String slovo : result) {
            System.out.println ( slovo );
        }
    }
}