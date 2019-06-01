import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;


public class HPravilnyiV {


    public static void main(String[] args) throws IOException {
        // Тестовый поток
      /*  String input = "10\n" +
                "internetsearching 15\n" +
                "taxi 3\n" +
                "taxi 2\n" +
                "quantumcomputing 8\n" +
                "internetsearching 5\n" +
                "taxi 5\n" +
                "genomananalysis 4\n" +
                "steel 40\n" +
                "quantumcomputing 2\n" +
                "steel 35";
       */
      /*Тестовый поток 2
      /*  String input = "10 1
5 brdwut semfgwku jnsmap jnsmap tirfs
5 dlhukmodsu muuwx tkewf kilro mivacuod
6 hrijcrtos brdwut zkmtuulwsn jxqqj tkewf kltidxomc
5 jxqqj jeuele muuwx jnsmap oucmyqlzfk
5 semfgwku tirfs luxvyd kilro jeuele
6 lvbttyp kilro xkexa hrijcrtos muuwx kilro
5 lvbttyp brdwut xkexa zyomdqio tkewf
6 jnsmap kilro zyomdqio jxqqj zyomdqio zyomdqio
4 zyomdqio jeuele tirfs lvbttyp
3 orbvhox jnsmap tkewf"


        InputStream inputStream = new ByteArrayInputStream(input.getBytes(Charset.forName("UTF-8")));
        BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));*/

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        int koluspeshworks = Integer.parseInt(str); //  Считать число историй успеха  и сохранить в переменную.

        int minyears = Integer.MAX_VALUE;

        Map<String, Integer> otrasli = new TreeMap<>();

        for (int i = 0; i < koluspeshworks; i++) {

            str = in.readLine();
            String[] line = str.split(" ");
            // если ключ - отрасль < ключ - отрасль то запоминаем, предыдущее забываем
            int yearsago = Integer.parseInt(line[1]);
            String key = line[0];
            if (!otrasli.containsKey(key) || yearsago < otrasli.get(key)) {
                otrasli.put(key, yearsago);

            }
            if (yearsago < minyears) {
                minyears = yearsago;
            }
        }

        // вывод на экран

        int finalMinyears = minyears;



        List<Map.Entry<String, Integer>> list = otrasli.entrySet().stream()
                .filter((e) -> e.getValue() == finalMinyears)
                .collect(Collectors.toList());
        System.out.println(list.size());
        System.out.println(minyears);
        otrasli.entrySet().stream()
                .filter((e) -> e.getValue() == finalMinyears)
                .forEach(e -> {

                    System.out.println(e.getKey());
                });


    }
}
