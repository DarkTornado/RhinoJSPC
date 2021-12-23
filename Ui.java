import java.awt.Dimension;
import javax.swing.AbstractAction;
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

        JMenuBar title = new JMenuBar();

        JMenu menu1 = new JMenu("File");
        JMenuItem item11 = new JMenuItem("Exit");
        menu1.add(item11);
        title.add(menu1);

        JMenu menu2 = new JMenu("Run");
        JMenuItem item21 = new JMenuItem("Run Source");
        menu2.add(item21);
        title.add(menu2);
        
        window.setJMenuBar(title);


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