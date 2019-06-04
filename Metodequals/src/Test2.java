import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;


public class Test2 {
    private ActionListener myActionListener;

    public static void main(String[] args) {
            Test2 gui = new Test2();
            gui.go();
        }


        public void go()  {
            JFrame frame = new JFrame ();
            JPanel panel = new JPanel ();


            JTextField field = new JTextField(20);
            field = new JTextField ( "Ваше имя" );
            System.out.println(field.getText());
            field.setText("Что угодно");
            field.setText("");
            field.addActionListener(myActionListener);
            field.selectAll();
            field.requestFocus();


            panel.setBackground ( Color.darkGray );
            panel.setLayout(new BoxLayout(panel,
                    BoxLayout. Y_AXIS));

            JButton button = new JButton("sss");
            JButton buttonTwo = new JButton("bss");
            JButton buttonThree = new JButton("huh");
            panel.add(button);
            panel.add(buttonTwo);
            panel.add(buttonThree);
            panel.add(field);


            JButton east = new JButton("East");
            JButton west = new JButton("West");
            JButton north = new JButton("North");
            JButton south = new JButton("South");
            JButton center = new JButton("Center");
            frame.getContentPane().add(BorderLayout.EAST,  panel);
            frame.getContentPane().add(BorderLayout.WEST,  west);
            frame.getContentPane().add(BorderLayout.NORTH, north);
            frame.getContentPane().add(BorderLayout.SOUTH,  south);
            frame.getContentPane().add(BorderLayout.CENTER,  center);
            frame.setSize(350,300);
            frame.setVisible(true);

            }
      }
