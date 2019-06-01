/*import java.lang.*;
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
        s = in.next ();



        while ( s.length () < kolzaryda - 1  ){
            s = s + in.next ();
        }
        kolzaryda = new char[ kolzaryda ];

        in.close ();
    }

    int maxkolfoto = 0;
    ArrayList<Integer> bestfoto = new ArrayList<> ();

    private static final char W_FOTO = 'W';
    private static final char F_FOTO = 'F';
    private static final char S_FOTO = 'S';

    final int kolzaryda;
    char[] zarydi;
    String s;


    void go() {
        boolean previos = true;


        int prevGoodfoto = 0;
        for (int currentIndex = 0; currentIndex < kolzaryda - 1; currentIndex++) {
            char symbol = s.charAt ( currentIndex);

            if (symbol == GOOD_FOTO) {
                previos = true;

            }

            if (symbol == BAD_FOTO) {
                if (previos) {  zarydi.add ( currentIndex - 1 + 2 );
                }
                previos = false;


            }
        }

        if (previos) {
            zarydi.add ( kolzaryda );
        }
    }


    void print() {

        System.out.println ( kolzaryda.size () );
        for (Integer elem : kolzaryda) {
            System.out.print ( elem + " " );
        }
    }

}
*/