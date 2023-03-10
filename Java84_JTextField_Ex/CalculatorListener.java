package Java84_JTextField_Ex;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorListener implements ActionListener {
    private CalculatorView cv ;

    public CalculatorListener(CalculatorView cv) {
        this.cv = cv;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String btns = e.getActionCommand();
        switch (btns){
            case "+":
                this.cv.sum();
                break;
            case "-":
                this.cv.minus();
                break;
            case "x":
                this.cv.multiply();
                break;
            case "/":
                this.cv.divide();
                break;
            case "^":
                this.cv.power();
                break;
            case "%":
                this.cv.mod();
                break;
        }
    }
}
