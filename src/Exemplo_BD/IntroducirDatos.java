/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exemplo_BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Samuel
 */
public class IntroducirDatos {
    private Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:D:\\Clase\\SQLMan\\hola.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
 
    public void insert(String Nombre, int NumeroID,int IdPais) {
        String sql = "INSERT INTO Clase(Nombre,NumeroID,IdPais) VALUES(?,?,?)";
 
        try (Connection conn = this.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, Nombre);
            pstmt.setInt(2, NumeroID);
            pstmt.setInt(3, IdPais);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("No se puede repetir la clave primaria!");
            JOptionPane.showMessageDialog(null,"No se puede repetir la clave primaria!");
        }
        }
    
     public void insert2(String NombrePais, int IdPais) {
        String sql1 = "INSERT INTO Pais(NombrePais,IdPais) VALUES(?,?)";
 
        try (Connection conn = this.connect();
            PreparedStatement pstmt2 = conn.prepareStatement(sql1)) {
            pstmt2.setString(1, NombrePais);
            pstmt2.setInt(2, IdPais);
            pstmt2.executeUpdate();
        } catch (SQLException e) {
            System.out.println("No se puede repetir la clave primaria!");
            JOptionPane.showMessageDialog(null,"No se puede repetir la clave primaria!");
        }
        }
    }