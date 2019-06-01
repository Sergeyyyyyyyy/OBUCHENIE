import interfaced.FlyingDragon;
import interfaced.FirebreathingDragon;

import java.util.ArrayList;
import java.util.List;

public class StartDragon {

    public static void main(String... args) {
        FlyingDragon flyingDragon = new FlyingDragon();
        flyingDragon.toString();

       FlyingDragon flyingDragon2 = new FlyingDragon (5, 4);
          flyingDragon.toString ();

       FirebreathingDragon firebreathingDragon = new FirebreathingDragon ("Gorynych",10);
         firebreathingDragon.printActiveHeads ();

        FirebreathingDragon firebreathingDragon1 = new FirebreathingDragon(1d, 2d, 3, 4);
        firebreathingDragon1.printActiveHeads();

       FirebreathingDragon firebreathingDragon2 = new FirebreathingDragon (20, 30, 50,100);
       firebreathingDragon2.printActiveHeads ();

        //List <FirebreathingDragon.FBHead>  test = new ArrayList<>();
        //test.add (new FirebreathingDragon.FBHead(150,3));
        //FirebreathingDragon firebreathingDragon3 = new FirebreathingDragon  (test);
        //firebreathingDragon3.printActiveHeads ();


    }
}
