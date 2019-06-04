import javafx.scene.Parent;

class Someclass{
            int x = 2;
            public void print() {
                System.out.println(x);
            }
        }
        class Child extends Parent {
            int x = 3;
            public static void main(String[] args) {
                new Child().print();
            }

            private void print() {
            }

            public void print(String val){
                System.out.println(val);
            }
        }



