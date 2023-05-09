package java79_Layout;
import javax.swing.*;
public class Agui extends JFrame {
    public Agui() {
        setTitle("My Gui");
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton button = new JButton();
        JPanel panel = new JPanel();

        // my error lines are under the "panel" and  "button"
        // it says i must implement the variables. what does that mean???
        panel.add(button);
    }
    public static void main(String[] args) {
        Agui a = new Agui();
    }
}