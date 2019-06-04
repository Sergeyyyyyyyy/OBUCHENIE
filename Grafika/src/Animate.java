import javax.swing.*;
import java.awt.*;

public class Animate {
    int x = 1;
    int y = 1;

    public static void main(String[] args) {
        Animate gui = new Animate ();
        gui.go ();
    }

    public void go() {
        JFrame frame = new JFrame ();
        frame.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
        MyDrawP drawP = new MyDrawP ();
        frame.getContentPane ().add ( drawP );
        frame.setSize ( 1920, 1080 );
        frame.setVisible ( true );
        for (int i = 0; i < 5000; i++, x++, y++) {
            x++;

            drawP.repaint ();
            try {
                Thread.sleep ( 50 );
            } catch (Exception ex) {}

            }
        }
        class MyDrawP extends JPanel {
            public void paintComponent(Graphics g) {
                g.setColor ( Color.white );
                g.fillRect ( 0, 0, 100, 100 );

                g.setColor ( Color.blue );
                g.fillRect ( x, y, 400 + x*2, 200 + y*2 );
                g.fillRect ( x, y, 350 - x*2, 150 - y*2 );
                g.fillRect ( x, y, 300 + x*2, 100 + y*2 );
                g.fillRect ( x, y, 250 - x*2, 100 - y*2 );

                g.fillRect ( x, y, x*2 - 400, y*2 - 200 );

            }
        }
    }



