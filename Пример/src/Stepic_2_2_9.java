public class Stepic_2_2_9 {

    public static boolean isPowerOfTwo(int value)
    {
        value = Math.abs(value);
        return value == 0 ? false : (Math.pow(2.0,Math.log(value)/Math.log(2.0)) == (double)value);
    }

    public static void main(String[] args) {
        // тестовые данные
        System.out.println(isPowerOfTwo(0));
        System.out.println(isPowerOfTwo(1));
        System.out.println(isPowerOfTwo(-2));
    }
}