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
    
    /*
    Conectamos la clase al archivo de la base de datos para poder realizar 
    los metodos siguientes que necestan de esta conexion
    */
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
   /*
    Metodo para insertar un nuevo alumno en la tabla Clase
    Se hace el insert propio de base da datos al igual que se realizaría en sql
    los datos se añaden con un metodo de la clase PreparedStatement que nos permite ejecutar
    el propio comando sql despues de insertar en cada valor los datos. Si se llegase a repetir
    la clave primaria saltaría la excepción avisando que no se puede repetir la misma
    */
    public String  insert(String Nombre, int NumeroID,int IdPais) {
        String sql = "INSERT INTO Clase(Nombre,NumeroID,IdPais) VALUES(?,?,?)";
 
        try (Connection conn = this.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, Nombre);
            pstmt.setInt(2, NumeroID);
            pstmt.setInt(3, IdPais);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Se ha añadido un Alumno");
        } catch (SQLException e) {
            System.out.println("No se puede repetir la clave primaria!");
            JOptionPane.showMessageDialog(null,"No se puede repetir la clave primaria!");
        }return sql;
        }
    
    
    /*
    Metodo para insertar un nuevo pais en la tabla Pais
    Se hace el insert propio de base da datos al igual que se realizaría en sql
    los datos se añaden con un metodo de la clase PreparedStatement que nos permite ejecutar
    el propio comando sql despues de insertar en cada valor los datos. Si se llegase a repetir
    la clave primaria saltaría la excepción avisando que no se puede repetir la misma
    */
     public String  insert2(String NombrePais, int IdPais) {
        String sql1 = "INSERT INTO Pais(NombrePais,IdPais) VALUES(?,?)";
 
        try (Connection conn = this.connect();
            PreparedStatement pstmt2 = conn.prepareStatement(sql1)) {
            pstmt2.setString(1, NombrePais);
            pstmt2.setInt(2, IdPais);
            pstmt2.executeUpdate();
            JOptionPane.showMessageDialog(null,"Se ha añadido un Pais");
        } catch (SQLException e) {
            System.out.println("No se puede repetir la clave primaria!");
            JOptionPane.showMessageDialog(null,"No se puede repetir la clave primaria!");
        }return sql1;
        }
    }