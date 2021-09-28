package loops;

import javax.swing.*;

public class game_loop_1_P1 {

    public game_loop_1_P1(int pos,JLabel P1C1,JLabel P1C2,JLabel P1C3,JLabel P1C4,JLabel P1C5,JLabel P1C6,JLabel P1C7,JLabel P1C8,JLabel P1C9) {
        Icon Imagines = new ImageIcon(getClass().getResource("/imagenfondo/label.jpg"));
        Icon jug_1 = new ImageIcon(getClass().getResource("/imagenfondo/personaje_1.png"));

        if (pos == 0) {
            P1C1.setIcon(jug_1);
            if (P1C1== null){
                P1C1.setIcon(jug_1);
            }
            else {
                P1C1.setIcon(jug_1);
                P1C2.setIcon(Imagines);
                P1C3.setIcon(Imagines);
                P1C4.setIcon(Imagines);
                P1C5.setIcon(Imagines);
                P1C6.setIcon(Imagines);
                P1C7.setIcon(Imagines);
                P1C8.setIcon(Imagines);
                P1C9.setIcon(Imagines);
            }
        }
        if (pos == 1) {
            P1C1.setIcon(Imagines);
            P1C2.setIcon(jug_1);
            P1C3.setIcon(Imagines);
            P1C4.setIcon(Imagines);
            P1C5.setIcon(Imagines);
            P1C6.setIcon(Imagines);
            P1C7.setIcon(Imagines);
            P1C8.setIcon(Imagines);
            P1C9.setIcon(Imagines);
        }
        if (pos == 2) {
            P1C1.setIcon(Imagines);
            P1C2.setIcon(Imagines);
            P1C3.setIcon(jug_1);
            P1C4.setIcon(Imagines);
            P1C5.setIcon(Imagines);
            P1C6.setIcon(Imagines);
            P1C7.setIcon(Imagines);
            P1C8.setIcon(Imagines);
            P1C9.setIcon(Imagines);

        }
        if (pos == 3) {
            P1C1.setIcon(Imagines);
            P1C2.setIcon(Imagines);
            P1C3.setIcon(Imagines);
            P1C4.setIcon(jug_1);
            P1C5.setIcon(Imagines);
            P1C6.setIcon(Imagines);
            P1C7.setIcon(Imagines);
            P1C8.setIcon(Imagines);
            P1C9.setIcon(Imagines);
        }
        if (pos == 4) {
            P1C1.setIcon(Imagines);
            P1C2.setIcon(Imagines);
            P1C3.setIcon(Imagines);
            P1C4.setIcon(Imagines);
            P1C5.setIcon(jug_1);
            P1C6.setIcon(Imagines);
            P1C7.setIcon(Imagines);
            P1C8.setIcon(Imagines);
            P1C9.setIcon(Imagines);
        }
        if (pos == 5) {
            P1C1.setIcon(Imagines);
            P1C2.setIcon(Imagines);
            P1C3.setIcon(Imagines);
            P1C4.setIcon(Imagines);
            P1C5.setIcon(Imagines);
            P1C6.setIcon(jug_1);
            P1C7.setIcon(Imagines);
            P1C8.setIcon(Imagines);
            P1C9.setIcon(Imagines);
        }
        if (pos == 6) {
            P1C1.setIcon(Imagines);
            P1C2.setIcon(Imagines);
            P1C3.setIcon(Imagines);
            P1C4.setIcon(Imagines);
            P1C5.setIcon(Imagines);
            P1C6.setIcon(Imagines);
            P1C7.setIcon(jug_1);
            P1C8.setIcon(Imagines);
            P1C9.setIcon(Imagines);
        }
        if (pos == 7) {
            P1C1.setIcon(Imagines);
            P1C2.setIcon(Imagines);
            P1C3.setIcon(Imagines);
            P1C4.setIcon(Imagines);
            P1C5.setIcon(Imagines);
            P1C6.setIcon(Imagines);
            P1C7.setIcon(Imagines);
            P1C8.setIcon(jug_1);
            P1C9.setIcon(Imagines);
        }
        if (pos == 8) {
            P1C1.setIcon(Imagines);
            P1C2.setIcon(Imagines);
            P1C3.setIcon(Imagines);
            P1C4.setIcon(Imagines);
            P1C5.setIcon(Imagines);
            P1C6.setIcon(Imagines);
            P1C7.setIcon(Imagines);
            P1C8.setIcon(Imagines);
            P1C9.setIcon(jug_1);
        }
    }
}
