mport java.awt.Graphics;
import java.awt.*;

public class KOT {
    public void paintComponent(Graphics g) {
        JFrame frame = new JFrame();
        frame.getContentPane().add(button);
        frame.setSize(300,300) ;
        frame.setVisible(true);
        button.addActionListener(this);
        public void actionPerformed(ActionEventevent) {
                button.setText ( "you clicked!" );
}

    }
    Image image = new Imagelcon("catzilla.jpg");
    get Image ();
    g.draw Image(image,3,4, this);
    Graphics2D g2d =  (Graphics2D)  g;


}
}