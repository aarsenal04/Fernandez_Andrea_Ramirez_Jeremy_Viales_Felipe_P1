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

    public Servidor() {
        try {
            ss = new ServerSocket(this.PUERTO); //Crea el server socket
            System.out.println("Esperando a que el cliente se conecte");

            this.socket = ss.accept(); //Espera a que un ÚNICO CLIENTE se conecte

            System.out.println("cliente conectado");

            out = new DataOutputStream(this.socket.getOutputStream()); //Para enviar datos

            in = new DataInputStream(this.socket.getInputStream()); // Para recibir datos

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Override
    public void run() { // C/M#PESO#Valor#impuesto
        try {
            Mensajero mensajero = Mensajero.getInstance();

            while (true) {

                this.msg = in.readUTF(); //Lee el dato que recibe

                int dado = Integer.parseInt(msg);

                mensajero.setNumber(dado);

                System.out.println("La posicion del cliente es " + dado);

            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void Send(String msg) throws IOException {
        try {

            this.out.writeUTF(msg); //Envio datos --> "5#1#6"
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }


}