import java.lang.*;
import java.util.Scanner;


public class Girlynda {

    public static void main(String[] args) {
        GirlyndaEvlampiy mp = new GirlyndaEvlampiy ();
        mp.go ();
        mp.print ();
    }
}

class GirlyndaEvlampiy {

    GirlyndaEvlampiy() {
        Scanner in = new Scanner ( System.in );
        number = in.nextInt ();
        lampochki = in.next ();
        in.close ();
    }

    int maxkolsvetlamp = 0;
    int nomerposlsvetlamp = 0;
    private static final char GOOD_LAMP = 'O';
    private static final char BAD_LAMP = 'X';
    final int number;
    final String lampochki;


    void go() {
        int prevGoodLampCount = 0;
        for (int currentIndex = 0; currentIndex < number; currentIndex++) {
            char symbol = lampochki.charAt ( currentIndex );

            if (symbol == GOOD_LAMP) {
                prevGoodLampCount++;

            }

            if (symbol == BAD_LAMP) {


                if (maxkolsvetlamp < prevGoodLampCount) {
                    maxkolsvetlamp = prevGoodLampCount;
                    nomerposlsvetlamp = currentIndex - prevGoodLampCount + 1;
                }
                prevGoodLampCount = 0;
            }
        }

        if (maxkolsvetlamp < prevGoodLampCount) {
            maxkolsvetlamp = prevGoodLampCount;
            nomerposlsvetlamp = number - prevGoodLampCount + 1;
        }
    }

    void print() {
        System.out.println ( maxkolsvetlamp );
        System.out.println ( nomerposlsvetlamp );

    }

}












