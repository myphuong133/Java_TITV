package Java84_JTextField_Ex;

import javax.swing.*;
import java.awt.*;

public class CalculatorView extends JFrame {
    private CalculatorModel cm ;

    private JTextField jt_1,jt_2,jt_rs;
    public CalculatorView() throws HeadlessException {
        this.cm = new CalculatorModel();
        this.init();
    }
    public void init(){
        this.setTitle("Calculator");
        this.setSize(400,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        Font font = new Font("Arial",Font.BOLD,25);
        JLabel jLabel_firstValue = new JLabel("1st Value");
        jLabel_firstValue.setFont(font);
        JLabel jLabel_secondValue = new JLabel("2st Value");
        jLabel_secondValue.setFont(font);
        JLabel jLabel_result = new JLabel("Result");
        jLabel_result.setFont(font);

        jt_1 = new JTextField(50);
        jt_1.setFont(font);
        jt_2 = new JTextField(50);
        jt_2.setFont(font);
        jt_rs = new JTextField(50);
        jt_rs.setFont(font);

        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(3,2));
        jp.add(jLabel_firstValue);
        jp.add(jt_1);
        jp.add(jLabel_secondValue);
        jp.add(jt_2);
        jp.add(jLabel_result);
        jp.add(jt_rs);

        JPanel center = new JPanel();
        center.setLayout(new GridLayout(3,3));
        JButton btnMinus = new JButton("-");
        JButton btnPlus = new JButton("+");
        JButton btnMultiply = new JButton("x");
        JButton btnDivision = new JButton("/");
        JButton btnCircumflex = new JButton("^");
        JButton btnMod = new JButton("%");

        center.add(btnPlus);
        center.add(btnMinus);
        center.add(btnMultiply);
        center.add(btnDivision);
        center.add(btnCircumflex);
        center.add(btnMod);

        this.setLayout(new BorderLayout());
        this.add(jp,BorderLayout.NORTH);
        this.add(center,BorderLayout.CENTER);

        CalculatorListener cl = new CalculatorListener(this);
        btnPlus.addActionListener(cl);
        btnMinus.addActionListener(cl);
        btnMultiply.addActionListener(cl);
        btnDivision.addActionListener(cl);
        btnCircumflex.addActionListener(cl);
        btnMod.addActionListener(cl);
    }

    public void sum(){
        double value_1 = Double.valueOf(jt_1.getText());
        double value_2 = Double.valueOf(jt_2.getText());
        this.cm.setFistValue(value_1);
        this.cm.setSecondValue(value_2);
        this.cm.sum();
        jt_rs.setText(String.valueOf(this.cm.getResult()));
    }

    public void minus(){
        double value_1 = Double.valueOf(jt_1.getText());
        double value_2 = Double.valueOf(jt_2.getText());
        this.cm.setFistValue(value_1);
        this.cm.setSecondValue(value_2);
        this.cm.minus();
        jt_rs.setText(String.valueOf(this.cm.getResult()));
    }

    public void multiply(){
        double value_1 = Double.valueOf(jt_1.getText());
        double value_2 = Double.valueOf(jt_2.getText());
        this.cm.setFistValue(value_1);
        this.cm.setSecondValue(value_2);
        this.cm.multiply();
        jt_rs.setText(String.valueOf(this.cm.getResult()));
    }
    public void divide(){
        double value_1 = Double.valueOf(jt_1.getText());
        double value_2 = Double.valueOf(jt_2.getText());
        this.cm.setFistValue(value_1);
        this.cm.setSecondValue(value_2);
        this.cm.divide();
        jt_rs.setText(String.valueOf(this.cm.getResult()));
    }

    public void power(){
        double value_1 = Double.valueOf(jt_1.getText());
        double value_2 = Double.valueOf(jt_2.getText());
        this.cm.setFistValue(value_1);
        this.cm.setSecondValue(value_2);
        this.cm.power();
        jt_rs.setText(String.valueOf(this.cm.getResult()));
    }
    public void mod() {
        double value_1 = Double.valueOf(jt_1.getText());
        double value_2 = Double.valueOf(jt_2.getText());
        this.cm.setFistValue(value_1);
        this.cm.setSecondValue(value_2);
        this.cm.mod();
        jt_rs.setText(String.valueOf(this.cm.getResult()));
    }
}
