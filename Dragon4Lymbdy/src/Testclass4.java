import java.util.ArrayList;
import java.util.List;

public class Testclass4 {
    public static void main(String... args) {

        FirebreathingDragon4LymbdaLymbda drag1 = new FirebreathingDragon4LymbdaLymbda(11,22);
        drag1.setHead(0, 47, 12);

        FirebreathingDragon4LymbdaLymbda drag2 = new FirebreathingDragon4LymbdaLymbda(55,77);
        drag2.setHead(0, 20, 75);

        FirebreathingDragon4LymbdaLymbda drag3 = new FirebreathingDragon4LymbdaLymbda();
        drag3.setHead(0, 56, 15);
        System.out.println ( "Четное кол-во крыльев: " + drag3.test.test ( drag3.getWings () ));

        FirebreathingDragon4LymbdaLymbda drag4 = new FirebreathingDragon4LymbdaLymbda();
        drag4.setHead(0, 87, 23);
        drag4.heads = 5;
        drag4.removedHead ( 1 );
        System.out.println ( "Стало голов: " + drag4.getHeads () );

        List<FirebreathingDragon4LymbdaLymbda> drags11 = new ArrayList<FirebreathingDragon4LymbdaLymbda>();
        drags11.add(drag1);
        drags11.add(drag2);

        System.out.printf("ArrayList  FirebreathingDragonhas %d elements \n", drags11.size());
        for (FirebreathingDragon4LymbdaLymbda elem:drags11) {

            System.out.println(elem);
        }


        List<FirebreathingDragon4LymbdaLymbda> drags22 = new ArrayList<FirebreathingDragon4LymbdaLymbda>();
        drags22.add(drag3);
        drags22.add(drag4);

        System.out.printf("ArrayList FlyingDragon %d elements \n", drags22.size());
        for (FirebreathingDragon4LymbdaLymbda elem:drags22) {

            System.out.println(elem);
        }
    }
}