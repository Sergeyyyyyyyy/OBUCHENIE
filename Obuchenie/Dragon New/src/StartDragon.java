import interfaced.FlyingDragon;
import interfaced.FirebreathingDragon;

public class StartDragon {

    public static void main (String... args) {
        FlyingDragon flyingDragon = new FlyingDragon ();
        flyingDragon.toString ();

        FlyingDragon flyingDragon2 = new FlyingDragon (5, 4);
        flyingDragon.toString ();

        FirebreathingDragon firebreathingDragon = new FirebreathingDragon ("Gorynych",10);
        firebreathingDragon.printActiveHeads ();
    }
}
