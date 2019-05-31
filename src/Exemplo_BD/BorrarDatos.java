/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exemplo_BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Samuel
 */
public class BorrarDatos {
    
    public int borrarAlumn(int numID) {
        String url = "jdbc:sqlite:D:\\Clase\\SQLMan\\hola.db";
        //Nos conectamos a la base
        try (Connection connn = DriverManager.getConnection(url);
        Statement stmt = connn.createStatement()) {
        String sql="DELETE FROM Clase where NumeroID='"+numID+"';";
        //Mandamos ejecutar el comando de borrado de la fila
        stmt.execute(sql);
        JOptionPane.showMessageDialog(null, "Fila borrada con Exito");
        } catch (SQLException ex) {
            System.out.println("NO hay filas para borar");
        } 
        return numID;
}
    public int borrarPais(int IdPais) {
        String url = "jdbc:sqlite:D:\\Clase\\SQLMan\\hola.db";
        //Nos conectamos a la base
        try (Connection connn = DriverManager.getConnection(url);
        Statement stmt = connn.createStatement()) {
        String sql="DELETE FROM Pais where IDPais='"+IdPais+"';";
        //Mandamos ejecutar el comando de borrado de la fila
        stmt.execute(sql);
        JOptionPane.showMessageDialog(null, "Fila borrada con Exito");
        } catch (SQLException ex) {
            System.out.println("NO hay filas para borar");
        } 
        return IdPais;
}
}
