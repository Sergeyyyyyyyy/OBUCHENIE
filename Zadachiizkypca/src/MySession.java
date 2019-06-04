import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class MySession {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader ( new InputStreamReader ( System.in ) );

        int countsofpost = Integer.parseInt ( bufferedReader.readLine () );
        String line;
        int kolvosposobov = 0;
        int countstrok = 1;

        for (Set<Integer> pozitiv = new HashSet<> (), negativ = new HashSet<> ();
             countstrok <= countsofpost && (line = bufferedReader.readLine ()) != null;
             countstrok++) {

            int otzyv = Integer.parseInt ( line );
            if (otzyv < 0) {
                negativ.add ( otzyv * -1 );
                if (pozitiv.contains ( otzyv * -1 )) {
                    kolvosposobov--;
                    pozitiv.remove ( otzyv * -1 );
                }
            } else {
                if (!pozitiv.contains ( otzyv )) {
                    kolvosposobov++;
                }
                pozitiv.add ( otzyv );
            }
        }
        System.out.println ( kolvosposobov );
    }
}
