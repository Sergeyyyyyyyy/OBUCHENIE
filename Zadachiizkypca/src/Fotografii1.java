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
        s = in.next ();


        while (s.length () < kolfoto - 1) {
            s = s + in.next ();
        }
        snimki = new char[ kolfoto ];

        in.close ();
    }

    int maxkolfoto = 0;
    ArrayList<Integer> bestfoto = new ArrayList<> ();

    private static final char GOOD_FOTO = '+';
    private static final char BAD_FOTO = '-';
    final int kolfoto;
    final char[] snimki;
    String s;


    void go() {
        boolean previos = true;


        int prevGoodfoto = 0;
        for (int currentIndex = 0; currentIndex < kolfoto - 1; currentIndex++) {
            char symbol = s.charAt ( currentIndex );

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



