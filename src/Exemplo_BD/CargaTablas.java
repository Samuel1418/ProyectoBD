/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exemplo_BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Samuel
 */
public class CargaTablas {
    static Object[] clase;
    static Object[] pais;

    ArrayList<Object[]> lista = new ArrayList<Object[]>();
    ArrayList<Object[]> lista2 = new ArrayList<Object[]>();

    /*
    Necesitamos conectar a la base  así que accedemos con el método estático
    Como hasta ahora conectampos con la base dando la ruta del archivo que 
    contiene la base de datos
    */
    private Connection connect() {
        String url = "jdbc:sqlite:D:\\Clase\\SQLMan\\hola.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    /*
    Método que permite meter todo lo quehay en la tabla Clase en un array.
    Gracias a este método despues voy poder actualizar las tablas a tiempo real
    */
    public ArrayList selectAll() {
        String sql = "SELECT Nombre, NumeroID, IDPais FROM Clase";

        try (Connection conn = this.connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                clase = new Object[3];
                clase[0] = rs.getInt("Nombre");
                clase[1] = rs.getString("NumeroID");
                clase[2] = rs.getInt("IDPais");
                lista.add(clase);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error, no se puede realizar el select");
        }
        return lista;
    }

    /*
    Método que permite meter todo lo quehay en la tabla Pais en un array.
    Gracias a este método despues voy poder actualizar las tablas a tiempo real
    */
    public ArrayList selectAll2() {
        String sql = "SELECT NombrePais, IDPais FROM Pais";

        try (Connection conn = this.connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                pais = new Object[2];
                pais[0] = rs.getString("NombrePais");
                pais[1] = rs.getInt("IDPais");
                lista2.add(pais);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error, no se puede realizar el select");
        }
        return lista2;
}
}
