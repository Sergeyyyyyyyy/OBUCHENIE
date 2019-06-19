
import java.util.ArrayList;
import java.util.stream.Stream;

public class MyPairClass {

    public static void main(String[] args) {

        ArrayList<MyPair> list = new ArrayList<> ();
        list.add ( new MyPair ( 2, 5 ) );
        list.add ( new MyPair ( 1, 6 ) );
        list.add ( new MyPair ( 4, 3 ) );
        list.add ( new MyPair ( -3, 5 ) );
        list.add ( new MyPair ( 5, -2 ) );
        list.add ( new MyPair ( 12, -8 ) );

        int sumMP = list.stream ().reduce ( 0, (sum, b) -> sum + b.getXY (), Integer::sum );
        System.out.println ( sumMP );

    }

}

class MyPair1 {
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    int x, y;

    MyPair1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int getXY() {
        return x * y;
    }


}