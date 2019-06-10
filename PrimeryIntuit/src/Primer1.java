import java.awt.*;

public class Primer1 {

    private static int width;


    public static void main(String[] args, Graphics g) {

        @SuppressWarnings("unused") public void paint (Graphics g){
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    int c = (int) ((i + j) * 255 / 6);
                    g.setColor ( new Color ( c, c, c ) );

                     g.fillRect ( i * getWidth () / 4, j * getHeight () / 4, getWidth () / 4, getHeight () / 4 );
                }
            }
        }
    }

    private static int getHeight() {
        return getHeight ();
    }

    public static int getWidth() {
        return width;
    }
}
