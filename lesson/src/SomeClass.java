public class SomeClass {
    public static void main(String[] args) {
        SomeClass t = new SomeClass();
        t.check("YES",5);
    }
    private int check(String x, int n) {
        if (n == 0) return n;
        else if (n == 1) {
            if (x != null) return 5;
        } else if (n == 2 && x != null) {
            if (x.equals("YES")) return 3;
            else if (x.equals("NO")) return 4;
        }
        return -1;
    }
}


