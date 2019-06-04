
public class Testduck {
    public static void main(String[] args) {
        int weight = 8;
        float density = 2.3F;
        String name = "Donald";
        long[] feathers = {1, 2, 3, 4, 5, 6};
        final boolean canFly = true;
        int airspeed = 22;

        Duck[] d = new Duck[ 7 ];
        d[ 0 ] = new Duck();
        d[ 1 ] = new Duck( density, weight );
        d[ 0 ] = new Duck( name, feathers );
        d[ 0 ] = new Duck( canFly );
        d[ 0 ] = new Duck( 3.3F, airspeed );
        d[ 0 ] = new Duck( false );
        d[ 0 ] = new Duck( airspeed, density );

    }

}

class Duck {

    private int pounds = 6;
    float floatability = 2.1F;
    String name = "Universalnaya";
    long[] feathers = {1, 2, 3, 4, 5, 6, 7};
    boolean canFly = true;
    int maxSpeed = 25;

    public Duck() {
        System.out.println( "Утка типа 1" );
    }

    public Duck(boolean fly) {
        canFly = fly;
        System.out.println( "Утка типа 2" );
    }

    public Duck(String n, long[] f) {
        name = n;
        feathers = f;
        System.out.println( "УтKa типа 3" );
    }

    public Duck(int w, float f) {
        pounds = w;
        floatability = f;
        System.out.println( "Утка типа 4" );
    }

    public Duck(float density, int max) {
        floatability = density;
        maxSpeed = max;
        System.out.println( "Утка типа 5" );
    }
}

