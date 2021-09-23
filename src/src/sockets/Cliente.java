package sockets;

import imagenfondo.Index;
import imagenfondo.Index2;
import imagenfondo.Index3;
import imagenfondo.Mensajero;
import tablero.*;

import java.io.*;
import java.net.Socket;
import javax.swing.*;


/**

 * Esta clase se define como  {@link Cliente} con sus respectivos sockets y funcionalidades

 */

public class Cliente implements Runnable{

    private Socket cliente;
    private DataOutputStream out;
    private DataInputStream in;
    private int puerto = 5000;
    private String host = "localhost";
    private JTextPane t;
    private Mensajero mensajero;

    public Cliente(/*JTextPane aText*/Mensajero mensajero){
        //t = aText;
        try {
            this.cliente = new Socket(this.host,this.puerto); //Creo el cliente
            this.in = new DataInputStream(cliente.getInputStream()); //objeto para recibir datos
            this.out = new DataOutputStream(cliente.getOutputStream()); //objeto para enviar

            this.mensajero = mensajero;

            /*if (map ==1){
                //new Index().setVisible(true);
                Index mapa = new Index();
                mapa.setVisible(true);
            }
            if (map ==2){
                new Index2().setVisible(true);
            }
            if (map ==3){
                new Index3().setVisible(true);
            }
            else{
                ;
            }*/
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Override
    public void run(){

        while (true){
            try {
                String msg = in.readUTF();

                System.out.println(msg);

                int dado = Integer.parseInt(msg);

                mensajero.setNumber(dado);

                //String valores[] = msg.split("#");
                //lista listaenlazada = new lista();
                //System.out.println(listaenlazada.get_lista());

                /*if (valores[0].equals("C")) {

                    t.setText(t.getText() + "\n" + "[Server] The value are: " + valores[1] + " " + valores[2] + " " + valores[3]);

                    int valor = Integer.parseInt(valores[1]);
                    int peso = Integer.parseInt(valores[2]);
                    int impuesto = Integer.parseInt(valores[3]);
                    double monto = (valor*(impuesto/100))+(peso*0.15);
                    this.Send("M#"+String.valueOf(monto));

                    t.setText(t.getText() + "\n" + "[Client] The value is: " + String.valueOf(monto));

                } else {
                    t.setText(t.getText() + "\n" + "[Server] The value is: " + valores[1]);
                    System.out.println(valores[1]);
                }*/
            } catch (IOException e) {
                e.printStackTrace();

            }
        }
    }



    public void Send(String msg){
        try {

            this.out.writeUTF(msg); //Envio datos --> "5#1#6"

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
