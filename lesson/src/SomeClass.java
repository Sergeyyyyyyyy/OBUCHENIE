public class SomeClass {
    public static void main(String[] args) {
        SomeClass t = new SomeClass();
        t.test();
    }
    void test() {
        Test:{
            test: for (int i = 0; true; i++) {
                if (i % 2 == 0) continue test;
                if (i > 10) break Test;
                System.out.print(i);
            }
        }
    }
}




