package com.app.sockets.dao;


import com.app.sockets.conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConversacionImpl implements ConversacionDAO {

    Conexion instanciaMySQL = Conexion.getInstance();

    @Override
    public void registrarConversacionA(String mensaje) {
        PreparedStatement consulta = null;
        Connection conexion = null;

        try {
            conexion = instanciaMySQL.conectar();
            consulta = conexion.prepareStatement("insert into conversaciones(CLIENTE) values(?)");

            consulta.setString(1, mensaje);
            consulta.executeUpdate();
        } catch (SQLException error) {
            System.out.println(error);
        }
    }

    @Override
    public void registrarConversacionB(String mensaje) {
        PreparedStatement consulta = null;
        Connection conexion = null;

        try {
            conexion = instanciaMySQL.conectar();
            consulta = conexion.prepareStatement("insert into conversaciones(SERVIDOR) values(?)");

            consulta.setString(1, mensaje);
            consulta.executeUpdate();
        } catch (SQLException error) {
            System.out.println(error);
        }
    }

}