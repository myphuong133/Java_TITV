package Java82_Font_size;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;


public class LastBtnView extends JFrame {
    private LastBtnModel lastBtnModel;

    private JLabel jLabel_output;
    public JPanel jPanel_footer;
    public LastBtnView(){
        this.lastBtnModel = new LastBtnModel();
        this.init();
    }
    public void init(){
        // Khỏi tạo cửa sổ
        this.setTitle("Last Button");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,300);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        // Tạo JPanel chứa các nút
        JPanel jPanel_btn = new JPanel();
        jPanel_btn.setLayout(new GridLayout(2,2,5,5));

        // Tạo font chữ
        Font font = new Font("Arial", Font.BOLD,20);

        // Gán font
        JButton btn_1 = new JButton("1");
        btn_1.setFont(font);
        JButton btn_2 = new JButton("2");
        btn_2.setFont(font);
        JButton btn_3 = new JButton("3");
        btn_3.setFont(font);
        JButton btn_4 = new JButton("4");
        btn_4.setFont(font);

        // add btn
        jPanel_btn.add(btn_1);
        jPanel_btn.add(btn_2);
        jPanel_btn.add(btn_3);
        jPanel_btn.add(btn_4);

        // Tạo jPanel của phần footer và gán font
        jPanel_footer = new JPanel();
        jLabel_output = new JLabel("----------",JLabel.CENTER);
        jPanel_footer.add(jLabel_output);
        jLabel_output.setFont(font);

        // Tạo Layout
        this.setLayout(new BorderLayout());

        // add footer và btn
        this.add(jPanel_btn,BorderLayout.CENTER);
        this.add(jLabel_output,BorderLayout.SOUTH);

        // Tạo Listener cho btn
        ActionListener btnListener = new LastBtnListener(this);

        // Gán Listener chó jButton
        btn_1.addActionListener(btnListener);
        btn_1.addActionListener(btnListener);
        btn_2.addActionListener(btnListener);
        btn_3.addActionListener(btnListener);
        btn_4.addActionListener(btnListener);

    }

    public void changeTo_1(){
        this.lastBtnModel.setValue(1);
        this.jLabel_output.setText("Last button: " + this.lastBtnModel.getValue());
    }
    public void changeTo_2(){
        this.lastBtnModel.setValue(2);
        this.jLabel_output.setText("Last button: " + this.lastBtnModel.getValue());

    }
    public void changeTo_3(){
        this.lastBtnModel.setValue(3);
        this.jLabel_output.setText("Last button: " + this.lastBtnModel.getValue());
    }
    public void changeTo_4(){
        this.lastBtnModel.setValue(4);
        this.jLabel_output.setText("Last button: " + this.lastBtnModel.getValue());
    }

}
