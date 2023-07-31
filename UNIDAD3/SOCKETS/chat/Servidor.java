package com.app.sockets.chat;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Observable;

public class Servidor extends Observable implements Runnable {

    private int puerto;

    public Servidor(int puerto) {
        this.puerto = puerto;
    }

    @Override
    public void run() {
        ServerSocket servidor = null;
        Socket socket = null;
        DataInputStream entrada;

        try {
            // SOCKET SERVIDOR
            
            servidor = new ServerSocket(puerto);
            System.out.println("SE AH INICIADO EL SERVIDOR");

            // ACCIONES A REALIZAR
            
            while (true) {
                
                // CLIENTE CONECTADO
                socket = servidor.accept();
                System.out.println("ONLINE");
                entrada = new DataInputStream(socket.getInputStream());

                // LECTURA DEL MENSAJE
                String mensaje = entrada.readUTF();
                System.out.println(mensaje);

                this.setChanged();
                this.notifyObservers(mensaje);
                this.clearChanged();

                // CLIENTE DESCONECTO O SERVICIO TERMINADO
                
                socket.close();
                System.out.println("OFFLINE");
            }
        } catch (IOException error) {
            System.out.println(error);
        }
    }

}