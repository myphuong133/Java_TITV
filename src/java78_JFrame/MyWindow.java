package java78_JFrame;

import javax.swing.*;

public class MyWindow extends JFrame {
    public MyWindow(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void showsss(){
        this.setVisible(true);
    }
    public void showss(String title){
        this.setTitle(title);
        this.setVisible(true);
    }
    public void showss(String title,int width,int height){
        this.setTitle(title);
        this.setSize(width, height);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        MyWindow m1 = new MyWindow();
        m1.showsss();
        m1.showss("alo",1120,300);
    }


}
