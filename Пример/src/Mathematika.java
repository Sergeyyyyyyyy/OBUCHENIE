

public class Mathematika {
    public static void main(String[] args) {
        doubleExpression(0.01, 0.02, 0.03);


    }

    public static boolean doubleExpression(double a, double b, double c) {

        boolean g = Math.abs((a + b) - c) < 1E-4;
        System.out.println(g);
        return g;
    }
}

