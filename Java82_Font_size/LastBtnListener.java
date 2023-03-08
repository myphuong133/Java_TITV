package Java82_Font_size;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LastBtnListener implements ActionListener {
    private LastBtnView lbv;

    public LastBtnListener(LastBtnView lbv) {
        this.lbv = lbv;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if (src.equals("1")){
            this.lbv.changeTo_1();
        } else if (src.equals("2")) {
            this.lbv.changeTo_2();
        } else if (src.equals("3")) {
            this.lbv.changeTo_3();
        } else if (src.equals("4")) {
            this.lbv.changeTo_4();
        }
    }
}
