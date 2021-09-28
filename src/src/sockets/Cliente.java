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


    public Cliente(){
        try {
            this.cliente = new Socket(this.host,this.puerto); //Creo el cliente
            this.in = new DataInputStream(cliente.getInputStream()); //objeto para recibir datos
            this.out = new DataOutputStream(cliente.getOutputStream()); //objeto para enviar

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run(){
        Mensajero mensajero = Mensajero.getInstance();

        while (true){
            try {
                String msg = in.readUTF();

                int dado = Integer.parseInt(msg);

                mensajero.setNumber(dado);

                System.out.println("La posicion del servidor es " + dado);

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
