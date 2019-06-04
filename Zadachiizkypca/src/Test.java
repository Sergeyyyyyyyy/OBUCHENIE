import java.util.*;

public class Test {
    public static void main(String[] args) {
        TreeSet<Point2> tsp = new TreeSet<>();
        HashSet<Point2> tsp2 = new HashSet<>();
        Random random = new Random();

        List<Point2> points = new ArrayList<>();

        int n = 1000000;
        for (int i = 0; i < n; i++) {
            int x = i;//random.nextInt();
            int y =i;// random.nextInt();
            Point2 p = new Point2(x, y);
            points.add(p);
        }

        long t1 = System.currentTimeMillis();
        for (int i = 0; i < points.size(); i++) {
            Point2 p = points.get(i);
            tsp.add(p);
        }
        long t2 = System.currentTimeMillis();
        long t3 = t2 - t1;
        System.out.println("Добавление в TreeSet " + t3);

        t1 = System.currentTimeMillis();
        for (int i = 0; i < points.size(); i++) {
            Point2 p = points.get(i);
            tsp2.add(p);
        }
        t2 = System.currentTimeMillis();
        t3 = t2 - t1;
        System.out.println("Добавление в HashSet " + t3);

        for (Point2 p : tsp2) {
            System.out.println(p);
        }
    }
}

class Point2 implements Comparable<Point2> {
    int x;
    int y;

    Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    @Override
    public int compareTo(Point2 p) {
        if (this.x < p.x) return -1;
        if (this.x > p.x) return 1;
        if (this.y > p.y) return -1;
        if (this.y < p.y) return 1;
        return 0;
    }

    class CmpPoints implements Comparator<Point2> {

        public int compare(Point2 p1, Point2 p2) {
            if (p1.x < p2.x) return -1;
            if (p1.x > p2.x) return 1;
            if (p1.y > p2.y) return -1;
            if (p1.y < p2.y) return 1;
            return 0;
        }
    }
}

