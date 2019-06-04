import java.util.ArrayList;
import java.util.List;

public class Test10042019 {
    public static void main (String []args){
        List animals = new ArrayList();
        Animal ourAnimal = new Animal();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Frog");
        animals.add(ourAnimal);

        String animal = (String) animals.get(0);
        System.out.println( animal );

        //////////  После появления дженериков//////////

        List<String> animals2 = new ArrayList<String>( );
        animals2.add("Cat");
        animals2.add("Dog");
        animals2.add("Frog");

        String anima2 = animals2.get(1);
        System.out.println( animal );

        ////////// Java 7 /////////
        List<String> animals3 = new ArrayList<>( );

    }
}

class Animal {

}
