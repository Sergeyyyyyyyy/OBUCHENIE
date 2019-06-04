import javafx.event.ActionEvent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class TwoButtons<ActionLisetener> {
    JFrame frame = new JFrame ();
    JLabel label = new JLabel ();

    public static void main(String[] args) {
        TwoButtons gui = new TwoButtons ();
        gui.go ();
    }

    public void go() {
        frame.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
        JButton labelButton = new JButton ( "Change Label" );
        labelButton.addActionListener ( new LabelListener () {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {

            }
        } );
        JButton colorButton = new JButton ( "Change Circle" );
        colorButton.addActionListener ( (ActionListener) new ColorListener () );

        label = new JLabel ( "I'm a label");
        MyDrawPanel drawPanel = new MyDrawPanel ();

        frame.getContentPane ().add ( BorderLayout.SOUTH, colorButton );
        frame.getContentPane ().add ( BorderLayout.CENTER, drawPanel );
        frame.getContentPane ().add ( BorderLayout.EAST, labelButton );
        frame.getContentPane ().add ( BorderLayout.WEST, label );

        frame.setSize ( 500, 500 );
        frame.setVisible (true);
        }

        abstract class LabelListener implements ActionListener {
            public void actionPerformed(ActionEvent event) {
                label.setText ( "Ouch! " );

            }
        }

        class ColorListener implements ActionListener {
            public void actionPerformed(ActionEvent event) {
                frame.repaint ();
            }

            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {

            }
        }
    }
