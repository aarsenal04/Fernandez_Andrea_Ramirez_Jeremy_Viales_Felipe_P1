package sockets;

import imagenfondo.Index;
import imagenfondo.Mensajero;

import java.io.*;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.*;

/**

 * Esta clase se define como  {@link Servidor} con sus respectivos sockets y funcionalidades

 */

public class Servidor extends Index implements Runnable {

    private final int PUERTO = 5000;

    public String msg;
    public ServerSocket ss;
    public Socket socket;
    public DataOutputStream out;
    public DataInputStream in;
    public JTextPane t;
    private Mensajero mensajero;

    public Servidor(Mensajero mensajero) {
        super();
        this.mensajero = mensajero;

        //JTextPane aText = new JTextPane();
        //t = aText;

        try {
            ss = new ServerSocket(this.PUERTO); //Crea el server socket
            System.out.println("Esperando a que el cliente se conecte");

            this.socket = ss.accept(); //Espera a que un ÚNICO CLIENTE se conecte
            System.out.println("cliente conectado");

            out = new DataOutputStream(this.socket.getOutputStream()); //Para enviar datos
            in = new DataInputStream(this.socket.getInputStream()); // Para recibir datos

            /*if (map ==1){
                new Index().setVisible(true);
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
    public void run() { // C/M#PESO#Valor#impuesto
        try {

            while (true) {

                this.msg = in.readUTF(); //Lee el dato que recibe

                System.out.println(msg);

                int dado = Integer.parseInt(msg);

                mensajero.setNumber(dado);


                /*if (valores[0].equals("C")) {

                    t.setText(t.getText() + "\n" + "[Client] The value are: " + valores[1] + " " + valores[2] + " " + valores[3]);

                    int valor = Integer.parseInt(valores[1]);
                    int peso = Integer.parseInt(valores[2]);
                    int impuesto = Integer.parseInt(valores[3]);
                    double monto = (valor * (impuesto / 100)) + (peso * 0.15);
                    this.Send("M#" + String.valueOf(monto));

                    t.setText(t.getText() + "\n" + "[Server] The value is: " + String.valueOf(monto));

                } else {
                    t.setText(t.getText() + "\n" + "[Client] The value is: " + valores[1]);
                    System.out.println(valores[1]);
                }*/

            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void Send(String msg) throws IOException {

        this.out.writeUTF(msg); //Envio datos --> "5#1#6"

    }


}