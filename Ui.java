import javax.swing.JFrame;

public class Ui {

    public static void main(String[] args) {
        JFrame window = new JFrame("Test Window");
        window.setExtendedState(JFrame.MAXIMIZED_BOTH);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }


}