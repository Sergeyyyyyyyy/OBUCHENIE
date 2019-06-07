/*
Лекция от 02.06.2019
        ---------------------
*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.function.*;

class Triplet implements Comparable<Triplet> {
    int a;
    String b;
    double c;


    @Override
    public int compareTo(Triplet o) {
        return 0;
    }
}

class CmpT implements Comparator<Triplet> {
    @Override
    public int compare(Triplet o1, Triplet o2) {
        return Integer.compare(o1.a, o2.a);
    }
}

public class Lection02062019 {
    public static void main(String[] args) {
        TreeSet<Triplet> tt1 = new TreeSet<Triplet>(new CmpT());
        TreeSet<Triplet> tt2 = new TreeSet<Triplet>(new Comparator<Triplet>() {
            @Override
            public int compare(Triplet o1, Triplet o2) {
                if (o1.a < o2.a) {
                    return -1;
                }
                if (o1.a > o2.a) {
                    return 1;
                }
                return 0;
            }
        });
        Comparator<Triplet> comparator = (o1, o2) -> {
            if (o1.a < o2.a) {
                return -1;
            }
            if (o1.a > o2.a) {
                return 1;
            }
            return 0;
        };
        List<Triplet> list = new ArrayList<>();

        Consumer f = (t) -> System.out.println(t);

        list.sort(comparator);
        int[] bonus = {10};
        IntUnaryOperator bonusAdder = (x) -> x + bonus[0];
        bonus[0]++;

        IntFunction<String[]> arrayAllocation = String[]::new;
    }
}