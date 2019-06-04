
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gr implements ActionListener {
    JButton button;
    private DebugGraphics graphics;

    public static void main(String[] args) {

        Gr gui = new Gr ();
        gui.go ();
    }

    public void actionPerformed(ActionEvent event) {
        button.setText ( "I've been clicked!" );
    }


    public void go() {
        JFrame frame = new JFrame ();
        button = new JButton ( "Click me" );
        button.addActionListener ( this );

        /*     graphics.fillOval(70,70,100,100) ;
         graphics.drawImage(myPic,10,10,this);
        */

        frame.getContentPane ().add ( BorderLayout.CENTER, button );
        frame.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
        frame.setSize ( 300, 300 );
        frame.setVisible ( true );


    }
}

