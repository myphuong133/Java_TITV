package java79_Layout;

import javax.swing.*;
import java.awt.*;

public class flowLayout extends JFrame {
    public flowLayout(){
        this.setTitle("Frame 1");
        this.setSize(600,400);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FlowLayout flowLayout = new FlowLayout();
        FlowLayout flowLayout_1 = new FlowLayout(FlowLayout.RIGHT);
        FlowLayout flowLayout_2 = new FlowLayout(FlowLayout.CENTER,50,10);

        GridLayout gridLayout = new GridLayout();
        GridLayout gridLayout1 = new GridLayout(4,4);
        GridLayout gridLayout2 = new GridLayout(4,4,50,25);

        BorderLayout borderLayout = new BorderLayout();

        this.setLayout(borderLayout);
        for (int i=0;i<5;i++){
            JButton btn = new JButton("" + i);
        }
        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton btn4 = new JButton("4");
        JButton btn5 = new JButton("5");

        this.add(btn1,BorderLayout.NORTH);
        this.add(btn2,BorderLayout.SOUTH);
        this.add(btn3,BorderLayout.EAST);
        this.add(btn4,BorderLayout.WEST);
        this.add(btn5,BorderLayout.CENTER);

        
    }

    public static void main(String[] args) {
        new flowLayout();
    }
}
