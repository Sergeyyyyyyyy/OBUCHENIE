import java.io.IOException;
import java.util.Scanner;

public class Exception3 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner ( System.in );
        while (true) {
            int x = Integer.parseInt (scanner.nextLine () );

            if (x != 0){
                try {
                    throw new IOException ();
                } catch (IOException e) {
                    System.out.println ( "Ne to!!!" );
                }
            }
        }
    }
}
