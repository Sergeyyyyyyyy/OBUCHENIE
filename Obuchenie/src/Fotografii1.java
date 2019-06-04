import java.lang.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Fotografii1 {

    public static void main(String[] args) {
        Foto mp = new Foto ();
        mp.go ();
        mp.print ();

    }
}

class Foto {
    Foto() {
        Scanner in = new Scanner ( System.in );
        kolfoto = in.nextInt ();
        snimki = new char[ kolfoto ];
        for (int i = 0; i < kolfoto - 1; i++) {
            snimki[ i ] = in.next ().charAt ( 0 );
        }

        in.close ();
    }

    int maxkolfoto = 0;
    ArrayList<Integer> bestfoto = new ArrayList<> ();

    private static final char GOOD_FOTO = '+';
    private static final char BAD_FOTO = '-';
    final int kolfoto;
    final char[] snimki;


    void go() {
        boolean previos = true;


        int prevGoodfoto = 0;
        for (int currentIndex = 0; currentIndex < kolfoto - 1; currentIndex++) {
            char symbol = snimki[ currentIndex ];

            if (symbol == GOOD_FOTO) {
                previos = true;

            }

            if (symbol == BAD_FOTO) {
                if (previos) {
                    bestfoto.add ( currentIndex - 1 + 2 );
                }
                previos = false;


            }
        }

        if (previos) {
            bestfoto.add ( kolfoto );
        }
    }


    void print() {

        System.out.println ( bestfoto.size () );
        for (Integer elem : bestfoto) {
            System.out.print ( elem + " " );
        }
    }

}



