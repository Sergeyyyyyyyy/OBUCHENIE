
interface AbletoEat {
    public void eat();


    public class Test {
        public static void main(String[] args) {
            AbletoEat abletoEat = new AbletoEat() {
                @Override
                public void eat() {
                    System.out.println( "Elfffff.." );
                }
            };
            abletoEat.eat();
        }
    }
}









