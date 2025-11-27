import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex97FlyingTextEx extends JFrame {
    private JPanel contentPane = new JPanel();
    private JLabel la = new JLabel("Hello");

    public Ex97FlyingTextEx() {
        super("상하좌우 Key to Text Move");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(null);
        c.addKeyListener(new MyKeyListener2());

        la.setLocation(50, 50);
        la.setSize(100, 20);
        c.add(la);
        
        setSize(200, 200);
        setVisible(true);

        c.setFocusable(true);
        c.requestFocus();
    }

    class MyKeyListener2 extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            int x = la.getX();
            int y = la.getY();
            if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                la.setLocation(x - 10, y);
            }
            else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                la.setLocation(x + 10, y);
            }
            else if (e.getKeyCode() == KeyEvent.VK_UP) {
                la.setLocation(x, y - 10);
            }
            else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                la.setLocation(x, y + 10);
            }
        }
    }

    public static void main(String[] args) {
        new Ex97FlyingTextEx();
    }
}
