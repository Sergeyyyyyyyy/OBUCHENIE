import java.lang.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Foto2 {

    public static void main(String[] args) {
        Foto mp = new Foto ();
        mp.go ();
        mp.print ();

    }
}

class Foto {

    Foto() {

        Scanner in = new Scanner ( System.in );
        kolzaryda = in.nextInt ();
        snimokbezvspyshki = in.nextInt ();
        snimokcvspyshkoi = in.nextInt ();
        s = in.next ();
        in.close ();
    }

     ArrayList<Integer> ostatokzaryda = new ArrayList<> ();

    private static final char W_FOTO = 'W';
    private static final char F_FOTO = 'F';
    private static final char S_FOTO = 'S';


    final int kolzaryda;
    final int snimokbezvspyshki;
    final int snimokcvspyshkoi;


    String s;


    void go() {
        boolean bezvspyshki = true;


        int prevGoodfoto = kolzaryda;
        for (int currentIndex = 0; currentIndex < s.length (); currentIndex++) {
            char symbol = s.charAt ( currentIndex);

            if (symbol == S_FOTO) {
                if (bezvspyshki) {
                      ostatokzaryda.add ( prevGoodfoto / snimokbezvspyshki );

                }
                else {
                    ostatokzaryda.add ( prevGoodfoto / snimokcvspyshkoi );
                }


            }

            if (symbol == W_FOTO) {

            }
        }




    }


    void print() {

        System.out.println ( kolzaryda.size () );
        for (Integer elem : kolzaryda) {
            System.out.print ( elem + " " );
        }
    }

}