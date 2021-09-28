package gui;

import imagenfondo.Index;
import imagenfondo.niveles;
import sockets.Cliente;
import sockets.Servidor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import imagenfondo.Index2;
import imagenfondo.Index3;

/**

 * La interfaz se realizó con Java Swing.
 * Esta clase se define como {@link AppDescuento} con sus respectivos sockets y funcionalidades.
 * Como se menciona en el Main, esta ventana surge de la acción en los botones de cliente y servidor.
 * Contiene las entradas de texto para valor, peso y tax (impuesto).
 * Contiene la entrada del chat por donde se intercambia la información requerida.

 */

public class AppDescuento extends JFrame{
    public AppDescuento(int i, String title,int map) throws IOException {

        niveles nivel = new niveles();
        nivel.setnivel(map);
        nivel.set_i(i);

        if (map ==1 ){
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

    }


}
