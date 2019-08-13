import java.util.Random;
import java.util.Scanner;


public class Bykvi {
    public static void main(String[] args) {

        Scanner sc = new Scanner ( System.in );

        char ch = (char) ('A' + new Random ().nextInt ( 26 ));

        System.out.println ( ch );
        System.out.println ( "Hello, try to guesse the letter!" );

        for (char i = 0; i < 26; i++) {
            char s = sc.next ().charAt ( 0 );

            if (ch == s) {
                System.out.println ( "Congratulations! You win this time!" );
                break;
            } else {
                System.out.println ( "Sorry, but you didn't guess, try again!" );

                if (Character.getNumericValue ( ch ) > Character.getNumericValue ( s )) {
                    System.out.println ( "I give you a hint! You are too low!" );
                } else if (Character.getNumericValue ( ch ) < Character.getNumericValue ( s )) {
                    System.out.println ( "I give you a hint! You are too high!" );
                }
            }
        }
    }
}
