import java.util.ArrayList;
import java.util.List;

public class Testclass4 {
    public static void main(String... args) {

        FirebreathingDragon4 drag1 = new FirebreathingDragon4(11,22);
        drag1.setHead(0, 47, 12);

        FirebreathingDragon4 drag2 = new FirebreathingDragon4(55,77);
        drag2.setHead(0, 20, 75);

        FlyingDragon4 drag3 = new FlyingDragon4();
        drag3.setHead(0, 56, 15);
        System.out.println ( "Четное кол-во крыльев: " + drag3.test.test ( drag3.getWings () ));

        FlyingDragon4 drag4 = new FlyingDragon4();
        drag4.setHead(0, 87, 23);
        drag4.heads = 5;
        drag4.removedHead ( 1 );
        System.out.println ( "Стало голов: " + drag4.getHeads () );

        List<FirebreathingDragon4> drags11 = new ArrayList<FirebreathingDragon4>();
        drags11.add(drag1);
        drags11.add(drag2);

        System.out.printf("ArrayList  FirebreathingDragonhas %d elements \n", drags11.size());
        for (FirebreathingDragon4 elem:drags11) {

            System.out.println(elem);
        }


        List<FlyingDragon4> drags22 = new ArrayList<FlyingDragon4>();
        drags22.add(drag3);
        drags22.add(drag4);

        System.out.printf("ArrayList FlyingDragon %d elements \n", drags22.size());
        for (FlyingDragon4 elem:drags22) {

            System.out.println(elem);
        }
    }
}