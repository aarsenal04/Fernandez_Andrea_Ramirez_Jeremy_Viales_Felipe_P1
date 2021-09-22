package gui;

import imagenfondo.Index;
import imagenfondo.Index2;
import imagenfondo.Index3;
import imagenfondo.niveles;
import sockets.Cliente;
import sockets.Servidor;
import tablero.tableroenlazado;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;


/**

 * La interfaz se realizó con Java Swing.
 * Esta clase se define como {@link AppDescuento} con sus respectivos sockets y funcionalidades.
 * Como se menciona en el Main, esta ventana surge de la acción en los botones de cliente y servidor.
 * Contiene las entradas de texto para valor, peso y tax (impuesto).
 * Contiene la entrada del chat por donde se intercambia la información requerida.

 */

public class AppDescuento extends JFrame{

    private JPanel VentanaC;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextPane textPane1;
    private JButton enviarButton;
    private Cliente c;
    private Servidor s;

    public AppDescuento(int i, String title,int width_1, int height_1,int map) throws IOException {


        /*JPanel panel = new JPanel();
        //map mapa = new map(panel, map);
        JButton boton = new JButton();
        panel.add(boton);

        setContentPane(VentanaC);
        setSize(width_1,height_1);
        setTitle(title);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);*/

        niveles nivel = new niveles();
        nivel.setnivel(i);

        if (map ==1){
            new Index(i).setVisible(true);
        }
        if (map ==2){
            new Index2(i).setVisible(true);
        }
        if (map ==3){
            new Index3(i).setVisible(true);
        }
        else{
            ;
        }

        if(i == 0){
            c = new Cliente(textPane1);
            Thread threadCliente = new Thread(c);
            threadCliente.start();


        }else{
            tableroenlazado temp = new tableroenlazado(9);
            temp.generatab();
            temp.imprimir();


            s = new Servidor(textPane1);
            Thread threadCliente = new Thread(s);
            threadCliente.start();


        }


        enviarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String msg = "";
                msg = "C#" + textField1.getText() + "#" + textField2.getText() + "#" + textField3.getText();

                if(i == 0){//Cliente
                    textPane1.setText(textPane1.getText() + "\n" + "[Client] The value are: " + textField1.getText() + " " + textField2.getText() + " " + textField3.getText());
                    c.Send(msg);
                }else{
                    try {
                        s.Send(msg);
                        textPane1.setText(textPane1.getText() + "\n" + "[Server] The value are: " + textField1.getText() + " " + textField2.getText() + " " + textField3.getText());
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }
                }
            }
        });
    }


}
