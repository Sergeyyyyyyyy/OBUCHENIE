import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Exceptions1 {
    public static void main (String [] args)  {
        File file = new File ("asdf");

        try {
            Scanner scanner = new Scanner (file);

            System.out.println ( "После Scanner - файл найден в проекте" );
        } catch (FileNotFoundException e) {
           System.out.println ( "Файл не найден" );
        }

        System.out.println ( "После блока try catch" );

    }
}
