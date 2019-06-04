import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PravilnyiVybor {



        public PravilnyiVybor() throws IOException {
        }

        BufferedReader in = new BufferedReader ( new InputStreamReader ( System.in ) );
        private int numberofsferaworking = Integer.parseInt ( in.readLine () );
        private int minsuccsessyears = Integer.parseInt ( in.readLine () );
        String sfera;

        catch( IOException ex);


        Set<Integer> sferaworking = new HashSet<> ();
        for(
        int i = 0; i<numberofsferaworking; i++)

        {
            int sfera = Integer.parseInt ( in.readLine () );
            if (minsuccsessyears > 0) {
                minsuccsessyears.add ( sfera );
            } else {
                sferaworking.remove ( -sfera );
            }
        }


        System.out.println(sferaworking.size());
        System.out.println(minsuccsessyears();
        System.out.println(sfera.size());
}


