package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

/**

 * La interfaz se realizó con Java Swing.
 * Esta clase se define como {@link selecter} con sus respectivos sockets y funcionalidades.
 * Como se menciona en el Main, el selecter es la primer ventana que aparece.
 * Contiene los botones de Cliente y Servidor

 */

public class selecter extends JFrame{

    private JButton clienteButton;
    private JPanel Canva;
    private JButton servidorButton;
    private JButton a5x5Button;
    private JButton a3x3Button;
    private JButton a4x4Button;
    private int width = 700;
    private int height = 700;
    private int map = 1;

    public selecter() {

        JFrame app = new JFrame("Selección");

        app.setContentPane(Canva);
        app.setSize(500,550);
        app.setTitle("Menu principal del juego");
        app.setVisible(true);
        app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        clienteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                app.setVisible(false);
                app.dispose();
                try {
                    AppDescuento app = new AppDescuento(0,"Cliente (Jugador 2)",width,height,map);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
        servidorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                app.setVisible(false);
                app.dispose();
                try {
                    AppDescuento app = new AppDescuento(1,"Servidor (Jugador 1)",width,height,map);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
        a3x3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                width = 700;
                height = 700;
                map = 1;
            }
        });
        a4x4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                width = 800;
                height = 800;
                map = 2;
            }
        });
        a5x5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                width = 900;
                height = 900;
                map = 3;
            }
        });
    }
}
