import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;
import java.util.stream.StreamSupport;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File( "C:\\Users\\Сергей\\Documents\\new1.txt" );
        Scanner scanner = new Scanner( file );
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] words = line.split( "\\s" );
            System.out.println( String.join( " ", words) );

        }
/*        String[] numbersString = line.split(" ");
        int [] numbers = new int [3];
        int counter = 0;

        for (String number : numbersString) {
            numbers[counter++] = Integer.parseInt( number );
        }

            System.out.println( Arrays.toString(numbers) );
            */



        }

    }





