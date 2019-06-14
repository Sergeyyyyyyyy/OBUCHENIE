import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestclassStreamApi10dgagons implements Flyable, FireBreathable {
    public static void main(String... args) {

        String[] arrs = {"drag5", "drag6", "drag7", "drag8", "drag9", "drag10"};
        Stream<String> drags = Arrays.stream ( arrs );
        long n1 = drags.filter ( s -> s.length () < 10 ).count ();
        System.out.println ( n1 );
        drags = Arrays.stream ( arrs );
        System.out.println ( drags.skip ( 10 ).count () );

        drags = Arrays.stream ( arrs );
        System.out.println ( drags.distinct ().distinct ().collect ( Collectors.toList () ) );
        drags = Arrays.stream ( arrs );
        drags.mapToInt ( String::length ).forEach ( System.out::println );
        drags = Arrays.stream ( arrs );
        drags.flatMapToInt ( String::chars ).forEach ( System.out::println );
        drags = Arrays.stream ( arrs );
        drags.peek ( c -> System.out.println ( "!! " + c ) ).forEach ( s -> {
        } );
        drags = Arrays.stream ( arrs );
        drags.limit ( 3 ).forEach ( System.out::println );
        drags = Arrays.stream ( arrs );
        drags.sorted ().forEach ( System.out::println );
        drags = Arrays.stream ( arrs );
        System.out.println ( drags.anyMatch ( "ab"::equals ) );
        drags = Arrays.stream ( arrs );
        System.out.println ( drags.allMatch ( s -> s.contains ( "a" ) ) );
        String s = "и\u0306";
        System.out.println ( s );
        System.out.println ( s.length () );


        FirebreathingDragon4LymbdaLymbda drag5 = new FirebreathingDragon4LymbdaLymbda ( 35, 57 );
        drag5.setHead ( 4, 51, 67 );
        FirebreathingDragon4LymbdaLymbda drag6 = new FirebreathingDragon4LymbdaLymbda ( 53, 98 );
        drag5.setHead ( 7, 84, 23 );
        FirebreathingDragon4LymbdaLymbda drag7 = new FirebreathingDragon4LymbdaLymbda ( 23, 30 );
        drag5.setHead ( 8, 98, 44 );
        FirebreathingDragon4LymbdaLymbda drag8 = new FirebreathingDragon4LymbdaLymbda ( 66, 84 );
        drag5.setHead ( 9, 9, 41 );
        FirebreathingDragon4LymbdaLymbda drag9 = new FirebreathingDragon4LymbdaLymbda ( 21, 28 );
        drag5.setHead ( 5, 37, 27 );
        FirebreathingDragon4LymbdaLymbda drag10 = new FirebreathingDragon4LymbdaLymbda ( 88, 33 );
        drag5.setHead ( 6, 78, 35 );
        FirebreathingDragon4LymbdaLymbda drag12 = new FirebreathingDragon4LymbdaLymbda ( 68, 22 );
        drag5.setHead ( 11, 523, 98 );
        FirebreathingDragon4LymbdaLymbda drag13 = new FirebreathingDragon4LymbdaLymbda ( 77, 11 );
        drag5.setHead ( 14, 90, 56 );
        FirebreathingDragon4LymbdaLymbda drag14 = new FirebreathingDragon4LymbdaLymbda ( 99, 55 );
        drag5.setHead ( 10, 21, 95 );
        FirebreathingDragon4LymbdaLymbda drag15 = new FirebreathingDragon4LymbdaLymbda ( 44, 20 );
        drag5.setHead ( 12, 41, 54 );

    }


    @Override
    public double getPowerPerHead() {
        return 0;
    }

    @Override
    public void setHead(int index, double fp, int rt) {

    }
}
