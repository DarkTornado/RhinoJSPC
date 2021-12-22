import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.GridLayout;
import java.awt.Color;

public class Ui {

    public static void main(String[] args) {
        JFrame window = new JFrame("Test Window");
        window.setLayout(new GridLayout(1, 2, 10, 10));

        JMenuBar bar = new JMenuBar();
        JMenu menu = new JMenu("Hello");
        JMenuItem item = new JMenuItem("World");
        menu.add(item);
        bar.add(menu);
        
        window.setJMenuBar(bar);


        JTextArea input = new JTextArea();
        input.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        window.add(input);
        JTextArea output = new JTextArea();
        output.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        window.add(output);

        window.setExtendedState(JFrame.MAXIMIZED_BOTH);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400, 300);
        window.setVisible(true);
    }

}