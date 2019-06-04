import java.util.Scanner;


public class TeaCoffe {

    public static void main(String[] args) {
        ManyCups mp = new ManyCups ();
        mp.go ();
        mp.print ();
    }
}


class ManyCups {
    final String kz ;

    ManyCups() {
        Scanner in = new Scanner(System.in);
        kz =  in.nextLine ();
    }


    int black = 0;
    int green = 0;
    int coffee = 0;


    void go() {
        int k = 0;
        for (int x = 0; x < kz.length (); x++) {
            char symbol = kz.charAt ( x );
            if (symbol >= '0' && symbol <= '9') {
                k = Character.getNumericValue ( symbol ) + k * 10;

            }
            if (symbol == 'B') {
                black = black + k;
                k = 0;
            }

            if (symbol == 'G') {
                green = green + k;
                k = 0;
            }

            if (symbol == 'C') {
                coffee = coffee + k;
                k = 0;
            }
        }
    }

    void print() {
        System.out.println ( black );
        System.out.println ( green );
        System.out.println ( coffee );
    }

}



