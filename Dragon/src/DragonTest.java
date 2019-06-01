import java.util.ArrayList;

public class DragonTest {
    public static void main(String[] args) {
        System.out.println(Dragon.getCount());

        FlyingDragon d = new FlyingDragon(5, " ", 8, 200);
        System.out.println(d.toString());
        ArrayList<Dragon> dragons = new ArrayList<>();
        dragons.add(d);
        dragons.add(new Dragon());
        d.setName("Renamed");
        for (int i = 0; i < dragons.size(); i++) {
            System.out.println(dragons.get(i));
        }
        System.out.println(Dragon.getCount());
    }
}
