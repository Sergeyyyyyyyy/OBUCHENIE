import javax.swing.*;
import java.util.Collection;
import java.util.List;

public class Generics {

    /* class Myclass<T1, T2, T3>*/
//T
//S
//U
//V
//
//E
//K
//V

    static class Box<T> {
        private T obj;

        public T get() {
            return obj;
        }

//        public void set(T t) {
//            obj = t;
//            Box<Integer> ib = new Box<Integer>();
//            ib.set(2);
//            ib = sb;
//        }
    }

//    <T> void meth (T t){
//        System.out.println(t.toString());
//    }

    public static <K, V> boolean compare(
            Pair<K, V> p1, Pair<K, V> p2) {
        return p1.hashCode() == p2.hashCode();
    }

    <T extends Number> void meth2(T t) {
        System.out.println(t.doubleValue());
    }

    static <T extends Comparable<T>> int countGt(
            T[] array, T el) {
        int cnt = 0;
        for (T elem : array) {
            if (elem.compareTo(el) > 0) {
                cnt++;
            }
        }
        return cnt;
    }


    public static void main(String[] args) {
        //  Box<Integer> ib = new Box<Integer>();
        Box rb = new Box();
        Box<String> sb = new Box<>();
        //sb.set("abc");
        rb = sb;
        sb = rb;
        Integer[] ints = new Integer[]{1, 2, 3, 4, 5};
        System.out.println(countGt(ints, 3));
    }

//    Collection<String>
    //      |   можно
//    list <String>
    //     |    можно
    //   ArrayList <String>


    //    list <String>
    //     |    нельзя
    //   ArrayList <String>

    void process(List<? extends MyClass> lst) {
        (List < ? > lst)
        (List<? super MyAnotherClass) lst )
    }
}

//     <ist<?>
//        ^
//        |
//        |можно
//<ist< ?extends Number>
//        ^
//        |
//        |можно
//<ist< ?extends Integer>
//         ^
//         |
//         |можно
//<ist< <Integer>

class WCE {
    void meth(List<?> l) {
        methHelper(l);


    }
    private <T> void methHelper (List <T> lst){
        lst.set (0, lst.get(0));
    }
}


interface Pair<K, V> {
    K getKey();

    V getValue();
}

class OrderedPair<K, V> implements Pair<K, V> {
    K key;
    V value;

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}


