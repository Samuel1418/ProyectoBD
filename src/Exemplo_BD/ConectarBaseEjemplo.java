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
    
    /*
    Metodo que nos conecta al archivo de hola.db o en su defecto nos crea el archivo 
    con ese nombre. Hay que dar la ruta al metodo getConnection y nos devolverá true
    si conecta a la tabla y false si no consigue establecer la conexión
    */
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
 
    
    /*
    Método para crear la tabla Clase.
    Con el String sql realizamos el create tal cual sería en la propia base de datos
    Añadimos el codigo del String al método execute despues de conectar a la base
    la clase Statement con el método createStatement
    Si hubiese algún error saltaría la excepcion 
    */
    public static String createNewTable() {
        String url = "jdbc:sqlite:D:\\Clase\\SQLMan\\hola.db";
        
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
        }return url;
    }
    
    
    /*
    Método para crear la tabla Pais.
    Con el String sql realizamos el create tal cual sería en la propia base de datos
    Añadimos el codigo del String al método execute despues de conectar a la base
    la clase Statement con el método createStatement.
    Si hubiese algún error saltaría la excepcion 
    */
    public static String createNewTable2() {
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
        }return url;
    }
    
}
