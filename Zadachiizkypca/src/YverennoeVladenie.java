import java.util.*;


public class YverennoeVladenie {
    public static void main(String[] args) {
        Scanning slovo = new Scanning ();
        slovo.reshenie ();
        slovo.print ();


    }
}

class Scanning {

    Map<String, Integer> slova = new HashMap<> ();
    int numbertolkovaniodnogoslova;
    int kolknoenwords = 0;

    Scanning() {
        Scanner sc = new Scanner ( System.in );
        int numbertolkovanislov = sc.nextInt ();
        numbertolkovaniodnogoslova = sc.nextInt ();
        for (int i = 0; i < numbertolkovanislov; i++) {
            String slovo = sc.next ();
            Boolean known = sc.nextInt () == 1;
            Integer tekucheekolvo = slova.getOrDefault ( slovo, 0 );
            if (known) {
                slova.put ( slovo, tekucheekolvo + 1 );
            }
        }

        sc.close ();
    }

    void reshenie() {
        kolknoenwords = (int)slova.entrySet ().stream ()
                .filter (entry -> entry.getValue () >=  numbertolkovaniodnogoslova)
                .count ();
    }

    void print() {
        System.out.print ( kolknoenwords );
    }

}