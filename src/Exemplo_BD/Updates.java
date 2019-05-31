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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Samuel
 */
public class Updates {
   
    public String upAlumn(String nombre, int IdPais, int NumeroID) {
        try {
            //Nos conectamos a la base
            Connection connn = DriverManager.getConnection("jdbc:sqlite:D:\\Clase\\SQLMan\\hola.db");
            Statement enunciado;
            enunciado = connn.createStatement();
            //realizamos el update sql cogiendo los datos
            enunciado.execute("UPDATE Clase set Nombre='" + nombre + "',IDPais='" + IdPais + "' where NumeroID='" + NumeroID + "';");
            JOptionPane.showMessageDialog(null, "Se ha actualizado un alumno con exito!");
        } catch (SQLException ex) {
            System.out.println("No se puede actualizar!");
        }
        return "Actualizado";
    }

    public String upPais(String NombrePais, int IdPais) {
        try {
            //Nos conectamos a la base
            Connection connn = DriverManager.getConnection("jdbc:sqlite:D:\\Clase\\SQLMan\\hola.db");
            Statement enunciado;
            enunciado = connn.createStatement();
            //realizamos el update sql cogiendo los datos
            enunciado.execute("UPDATE Pais set NombrePais='" + NombrePais + "' where IDPais='" + IdPais + "';");
            JOptionPane.showMessageDialog(null, "Se ha actualizado un pais con exito!");
        } catch (SQLException ex) {
            System.out.println("No se puede actualizar!");
        }
        return "Actualizado";
    }
}
