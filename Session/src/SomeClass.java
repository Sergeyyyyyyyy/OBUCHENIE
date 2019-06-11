public class SomeClass {
    public static void main(String[] args) {
        int a[][] = {{1, 2}, {3}};
        int b[][] = (int[][]) a.clone();
        a[0] = new int[]{0};
        System.out.println(b[0][0]);
    }
}
