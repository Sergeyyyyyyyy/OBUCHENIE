import java.io.*;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Set;

public class Session {
    public static void main(String[] args) throws IOException {

/*      String input = "5\n" +
                "+1\n" +
                "-8\n" +
                "-8\n" +
                "-2\n" +

//                "+8";
 */

/*        String input = "3\n" +
                "-4\n" +
                "+2\n" +
                "-2";
*/
  /*/      String input = "10\n" +
                "-3\n" +
                "+4\n" +
                "-4\n" +
                "+8\n" +
                "-9\n" +
                "-8\n" +
                "+1\n" +
                "-1\n" +
                "+9\n" +
               "+8";
/*/


       // InputStream inputStream = new ByteArrayInputStream(input.getBytes(Charset.forName("UTF-8")));

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        int countsofpost = Integer.parseInt(bufferedReader.readLine());
        String line;
        int kolvosposobov = 0; int countstrok = 1;

        for (Set<Integer> pozitiv = new HashSet<>(), negativ = new HashSet<>();
             countstrok <= countsofpost && (line = bufferedReader.readLine()) != null;
             countstrok++ ) {

            int otzyv = Integer.parseInt(line);
            if (otzyv < 0) {
                negativ.add(otzyv * -1);
                if (pozitiv.contains(otzyv * - 1)){
                    kolvosposobov --;
                    pozitiv.remove(otzyv* - 1);
                }
            } else {
                if (!pozitiv.contains(otzyv)){
                    kolvosposobov ++;
                }
                pozitiv.add(otzyv);

            }

            //  если число "+" , то запоминаем способ
            // если "-" , то удаляем такой способ
        }
        System.out.println(kolvosposobov);
    }

}



