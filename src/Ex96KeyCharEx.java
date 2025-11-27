import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex96KeyCharEx extends JFrame {
    private JLabel la = new JLabel("<Enter> Key Press!");
    public Ex96KeyCharEx() {
        super("KeyListener의 문자 키 입력 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
        contentPane.add(la);
        contentPane.addKeyListener(new MyKeyListener());
        setSize(250,150);
        setVisible(true);

        contentPane.setFocusable(true);
        contentPane.requestFocus();
    }

    class MyKeyListener extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            if(e.getKeyChar() == '\n') {
                int r = (int)(Math.random() * 256);
                int g = (int)(Math.random() * 256);
                int b = (int)(Math.random() * 256);
                la.setText("rgb(" + r + "," + g + "," + b + ")");
                getContentPane().setBackground(new Color(r, g, b));
            } else if(e.getKeyChar() == 'q'){
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        new Ex96KeyCharEx();
    }
}
