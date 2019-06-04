import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.event.ActionListener;

class InnerButton {

    JFrame frame;
    JButton b;

    public static void main(String[] args) {
        InnerButton gui = new InnerButton ();
        gui.go ();
    }

    public void go() {
        frame = new JFrame ();
        frame.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
        b = new JButton ( "A" );
        b.addActionListener (new Blistener ());

        frame.getContentPane ().add ( BorderLayout.CENTER, b );
        frame.setSize ( 70, 70 );
        frame.setVisible ( true );

    }

    class Blistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (b.getText ().equals ( "A" )) {
                b.setText ( "B" );
            } else {
                b.setText ("A");
            }
        }
    }
}




