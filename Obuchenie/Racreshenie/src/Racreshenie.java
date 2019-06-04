import java.io.*;
import java.nio.charset.Charset;
import java.util.*;
import java.util.stream.Collectors;


public class Racreshenie {


    public static void main(String[] args) throws IOException {
        // Тестовый поток
        //   BufferedReader in = inputTestCase1();
        BufferedReader in = inputTestCase2();
        //  BufferedReader in = inputTestCase3();

        // BufferedReader in = reaIInput();

        String str = in.readLine();
        String[] line = str.split(" ");

        int koldney = Integer.parseInt(line[0]); //  Считаем кол-во дней  и сохраним в переменную.

        int kolpar = Integer.parseInt(line[1]); // Кол-во пар которые можно пропустить подряд

        List<String> dni = new ArrayList<>();

        Map<String, Integer> kolpredmetov = new HashMap<>();

        for (int i = 0; i < koldney; i++) {

            str = in.readLine();
            dni.add(str);
            String[] lineday = str.split(" ");
            int kolparvden = Integer.parseInt(lineday[0]);
            for (int j = 0; j < kolparvden; j++) {
                Integer predyducheeChislo = kolpredmetov.getOrDefault(lineday[j + 1], 0);
                kolpredmetov.put(lineday[j + 1], predyducheeChislo + 1);
            }

        }
        Set<String> predmetnehodit = new HashSet<>();

        kolpredmetov.forEach((k, v) -> {
            if (v <= kolpar) {
                predmetnehodit.add(k);
            }
        });
/* если предмета нет "kolpar" раза в день и в предыдущие дни, то этот день запоминем как "koldneyposecheniy"
   если предмет встречается "kolpar" 2 раза в день или в предыдущие дни, то этот день запоминем как "koldneyneposecheniy"
   выводим на экран "koldneyposecheniy"
 */
        Set<String> poseshenyePary = new HashSet<>();
        Map<String, Integer> neposeshenyePary = new HashMap<>();
        int koldneyposecheniy = 0;

        for (int i = 0; i < koldney; i++) {
            str = dni.get(i);
            String[] lineday = str.split(" ");
            int kolparvden = Integer.parseInt(lineday[0]);

            Set<String> unicalnyePariVodindene = new HashSet<>();
            for (int j = 0; j < kolparvden; j++) {
                String para = lineday[j + 1];
                if (!predmetnehodit.contains(para)) {
                    unicalnyePariVodindene.add(para);
                }
            }
            boolean estliParykotoryeNadoPosetite = false;
            for (String para : unicalnyePariVodindene) {
                if (!poseshenyePary.contains(para) ||
                        neposeshenyePary.getOrDefault(para, 0) >= kolpar) {
                    estliParykotoryeNadoPosetite = true;
                    break;
                }
            }


            if (estliParykotoryeNadoPosetite) {
                koldneyposecheniy++;
                poseshenyePary.addAll(unicalnyePariVodindene);
                //for (String para :unicalnyePariVodindene) {
                //    neposeshenyePary.remove(para);
                //}
                neposeshenyePary.clear();
            } else {
                for (String para :unicalnyePariVodindene) {
                    Integer predyducheeChislo = neposeshenyePary.getOrDefault(para, 0);
                    neposeshenyePary.put(para, predyducheeChislo + 1);
                }
            }


        }


        System.out.println(koldneyposecheniy);
    }

    private static BufferedReader inputTestCase3() {
        String input = "";

        InputStream inputStream = new ByteArrayInputStream(input.getBytes(Charset.forName("UTF-8")));
        return new BufferedReader(new InputStreamReader(inputStream));
    }

    private static BufferedReader inputTestCase2() {
        String input = "10 1\n" +
                "5 brdwut semfgwku jnsmap jnsmap tirfs\n" +
                "5 dlhukmodsu muuwx tkewf kilro mivacuod\n" +
                "6 hrijcrtos brdwut zkmtuulwsn jxqqj tkewf kltidxomc\n" +
                "5 jxqqj jeuele muuwx jnsmap oucmyqlzfk\n" +
                "5 semfgwku tirfs luxvyd kilro jeuele\n" +
                "6 lvbttyp kilro xkexa hrijcrtos muuwx kilro\n" +
                "5 lvbttyp brdwut xkexa zyomdqio tkewf\n" +
                "6 jnsmap kilro zyomdqio jxqqj zyomdqio zyomdqio\n" +
                "4 zyomdqio jeuele tirfs lvbttyp\n" +
                "3 orbvhox jnsmap tkewf";

        InputStream inputStream = new ByteArrayInputStream(input.getBytes(Charset.forName("UTF-8")));
        return new BufferedReader(new InputStreamReader(inputStream));
    }


    private static BufferedReader reaIInput() {
        // System.out.println("Iput test ");
        return new BufferedReader(new InputStreamReader(System.in));
    }

    private static BufferedReader inputTestCase1() {
        String input = "8 2\n" +
                "4 algebra geometry algebra geometry\n" +
                "5 analysis electricity cryptography analysis analysis\n" +
                "3 electricity cryptography analysis\n" +
                "3 algebra computerscience electricity\n" +
                "3 electricity electricity computerscience\n" +
                "4 analysis computerscience history history\n" +
                "3 cryptography algebra cryptography\n" +
                "3 algebra cryptography cryptography";


        InputStream inputStream = new ByteArrayInputStream(input.getBytes(Charset.forName("UTF-8")));
        return new BufferedReader(new InputStreamReader(inputStream));
    }
}