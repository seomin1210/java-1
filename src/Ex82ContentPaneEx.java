import javax.swing.*;
import java.awt.*;

public class Ex82ContentPaneEx extends JFrame {
    public Ex82ContentPaneEx() {
        setTitle("ContentPane과 JPanel");  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Container contentPane = getContentPane();
        // getContentPane().setBackground(Color.orange);
        // getContentPane().setLayout(new FlowLayout());

        Container contentPane = getContentPane();
        contentPane.setBackground(Color.orange);
        contentPane.setLayout(new FlowLayout());

        add(new JButton("OK"));
        add(new JButton("Cancel"));
        add(new JButton("Ignore"));

        setSize(300, 150);
        setVisible(true);
    }    

    public static void main(String[] args) {
        new Ex82ContentPaneEx();
    }
}
