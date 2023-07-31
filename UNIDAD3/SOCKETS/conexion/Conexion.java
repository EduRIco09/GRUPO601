package com.app.sockets.conexion;

import java.sql.*; // importa todas clases y elementos del paquete java.sql
 
public class Conexion {

    // encapsulamiento de variables
    // estas variables solo se utilizaran dentro de esta clase
    
    private static final String URL = "jdbc:mysql://localhost/chat";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static Conexion instancia;
    
    public Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD); 
    }

    // METODOS
    
    public void cerrarResultado(ResultSet resultado) {
        try {
            resultado.close();
        } catch (SQLException error) {
            System.out.println(error);
        }
    }

    public void desconectar(Connection conexion) {
        try {
            conexion.close();
        } catch (SQLException error) {
            System.out.println(error);
        }
    }

    public void cerrarStatement(PreparedStatement statement) {
        try {
            statement.close();
        } catch (SQLException error) {
            System.out.println(error);
        }
    }
    
    public static Conexion getInstance(){
        if(instancia == null){
            instancia = new Conexion();
        }
        return instancia;
    }
}