import java.awt.Color;


import javax.swing.JFrame;
import javax.swing.JPanel;

class TestPaint extends JPanel {

    public TestPaint() {
        setBackground(Color.yellow);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(-1, 1, getWidth(), getHeight());
    }

    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(300, 300);
        jFrame.add(new TestPaint());
        jFrame.setVisible(true);
    }
}