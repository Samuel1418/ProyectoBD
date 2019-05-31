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

/**
 *
 * @author Samuel
 */
public class ConectarBaseEjemplo {
    public static void connect() {
        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:D:\\Clase\\SQLMan\\hola.db";
            // create a connection to the database
            conn = DriverManager.getConnection(url);
            
            System.out.println("Conexion= True");
            
        } catch (SQLException e) {
            System.out.println("Conexion= False");
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
 
    
    
    public static void createNewTable() {
        // SQLite connection string
        String url = "jdbc:sqlite:D:\\Clase\\SQLMan\\hola.db";
        
        // SQL statement for creating a new table
        String sql = "CREATE TABLE IF NOT EXISTS Clase (\n"
                + "	Nombre text ,\n"
                + "	NumeroID integer PRIMARY KEY,\n"
                + "	IdPais integer\n"
                + ");";
        
        try (Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void createNewTable2() {
        // SQLite connection string
        String url = "jdbc:sqlite:D:\\Clase\\SQLMan\\hola.db";
        
        // SQL statement for creating a new table
        String sql1 = "CREATE TABLE IF NOT EXISTS Pais (\n"
                + "	NombrePais text NOT NULL,\n"
                + "	IdPais integer PRIMARY KEY\n"
                + ");";
        
        try (Connection connn = DriverManager.getConnection(url);
            Statement stmt = connn.createStatement()) {
            stmt.execute(sql1);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
