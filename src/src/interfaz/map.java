package interfaz;
import javax.swing.*;
import java.awt.*;

public class map {

    public map(JPanel panel,int map){

        JButton button = new JButton();
        JFrame frame = new JFrame();
        frame.setSize(1000,1000);


        if (map == 1){
            FondoPanel_1 fondo = new FondoPanel_1();
            frame.setContentPane(fondo);
        }
        if (map == 2){
            FondoPanel_2 fondo = new FondoPanel_2();
            frame.setContentPane(fondo);
        }
        if (map ==3){
            FondoPanel_4 fondo = new FondoPanel_4();
            frame.setContentPane(fondo);


        }
        else{
            ;
        }

        frame.setVisible(true);


    }
    class FondoPanel_1 extends JPanel{
        private Image imagen;

        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("3x3.png")).getImage();
            g.drawImage(imagen,0,0,getWidth(),getHeight(),this);
            setOpaque(false);
            super.paint(g);
            }
        }


    class FondoPanel_2 extends JPanel{
        private Image imagen;

        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("4x4.png")).getImage();
            g.drawImage(imagen,0,0,getWidth(),getHeight(),this);
            setOpaque(false);
            super.paint(g);
        }
    }


    class FondoPanel_4 extends JPanel{
        private Image imagen;

        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("5x5.png")).getImage();
            g.drawImage(imagen,0,0,getWidth(),getHeight(),this);
            setOpaque(false);
            super.paint(g);
        }
    }


}

