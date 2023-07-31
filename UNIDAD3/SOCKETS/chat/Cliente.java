package com.app.sockets.chat;

import java.io.*; // Contiene clases para realizar operaciones de entrada y salida (input/output) en el programa. 
import java.net.Socket;// Contiene clases que se utilizan para realizar operaciones de red,

public class Cliente implements Runnable{

    //Creamos los atributos de puerto y mensaje
    private int puerto;
    private String mensaje;

    public Cliente(int puerto, String mensaje) {
        this.puerto = puerto;
        this.mensaje = mensaje;
    }
    
    @Override
    public void run() {
        //Host del servidor
        final String HOST = "127.0.0.1";
        
        //Puerto del servidor
        DataOutputStream salida;
        
        try{
            Socket socket = new Socket(HOST, puerto);
            salida = new DataOutputStream(socket.getOutputStream());
            
            //enviamos el mensaje
            salida.writeUTF(mensaje);
        }catch(IOException error){
            System.out.println(error);
        }
    }
    
}