import java.util.ArrayList;
import java.util.List;

public class Testclass {
    public static void main(String... args) {

        FirebreathingDragon drag1 = new FirebreathingDragon(11,22);
        drag1.setHead(0, 47, 12);

        FirebreathingDragon drag2 = new FirebreathingDragon(55,77);
        drag2.setHead(0, 20, 75);

        FlyingDragon drag3 = new FlyingDragon();
        drag3.setHead(0, 56, 15);

        FlyingDragon drag4 = new FlyingDragon();
        drag4.setHead(0, 87, 23);

        List<FirebreathingDragon> drags11 = new ArrayList<FirebreathingDragon>();
        drags11.add(drag1);
        drags11.add(drag2);

        System.out.printf("ArrayList  FirebreathingDragonhas %d elements \n", drags11.size());
        for (FirebreathingDragon elem:drags11) {

            System.out.println(elem);
        }


        List<FlyingDragon> drags22 = new ArrayList<FlyingDragon>();
        drags22.add(drag3);
        drags22.add(drag4);

        System.out.printf("ArrayList FlyingDragon %d elements \n", drags22.size());
        for (FlyingDragon elem:drags22) {

            System.out.println(elem);
        }
    }
}