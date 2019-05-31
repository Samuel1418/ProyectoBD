/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exemplo_BD;

import static Exemplo_BD.ConectarBaseEjemplo.connect;
import static Exemplo_BD.ConectarBaseEjemplo.createNewTable;
import static Exemplo_BD.ConectarBaseEjemplo.createNewTable2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Samuel
 */
public class Tabla extends javax.swing.JFrame {

    /**
     * Creates new form Tabla
     */
    public Tabla() {
        initComponents();
    }

    /*
    Permite cargar en la interfaz la tabla llamando a los métodos de la clase
    CargaTablas. Se meten en un array los arrays cargados por el propio método
    que ya tienen dentro los datos de su tabla. Y luego se meten dentro de la
    interfaz gráfica recorriendo los arrays y a su vez añadiendo a la tabla
    */
     public String mostrarTablas() {
        CargaTablas obx = new CargaTablas();

        ArrayList<Object[]> listaclase = new ArrayList<Object[]>();
        ArrayList<Object[]> listapais = new ArrayList<Object[]>();
        listaclase = obx.selectAll();
        listapais = obx.selectAll2();

        DefaultTableModel modelo = (DefaultTableModel) tabla1.getModel();
        for (Object[] ele : listaclase) {
            modelo.addRow(ele);
        }
        DefaultTableModel modelo2 = (DefaultTableModel) tabla2.getModel();
        for (Object[] elem : listapais) {
            modelo2.addRow(elem);

        }

        tabla1.setModel(modelo);
        tabla2.setModel(modelo2);
        return "tablas cargadas";

}
     /*
     Método que me permite vaciar las tablas, para asi hacer que la interfaz
     se quede sin tabla y luego volver a cargar la misma. De este modo lo que
     hago es que las tablas se actualicen. Con este método se borra y con el 
     mostrar se ve la tabla con los nuevos datos.
     */
     public String vaciarTabla() {
        try {
            DefaultTableModel modelo = (DefaultTableModel) tabla1.getModel();
            int filas = tabla1.getRowCount();
            for (int i = 0; i < filas; i++) {
                modelo.removeRow(0);
            }
            DefaultTableModel modelo2 = (DefaultTableModel) tabla2.getModel();
            filas = tabla2.getRowCount();
            for (int i = 0; i < filas; i++) {
                modelo2.removeRow(0);
            }
        } catch (Exception e) {
            System.out.println("no se pudo resetear la tabla");
        } return "tabla vaciada";
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        liTexto1 = new javax.swing.JTextField();
        liTexto2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        liTexto3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        liTexto4 = new javax.swing.JTextField();
        liTexto5 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        liTexto7 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        liTexto8 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        liTexto9 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        liTexto10 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        liTexto11 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();

        jLabel4.setText("jLabel4");

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre");

        jLabel2.setText("NumeroID");

        liTexto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                liTexto1ActionPerformed(evt);
            }
        });

        liTexto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                liTexto2ActionPerformed(evt);
            }
        });

        jButton1.setText("Agregar a Tabla Clase");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Mostrar Tablas");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Borrar Tabla Entera");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setText("IdPais");

        liTexto3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                liTexto3ActionPerformed(evt);
            }
        });

        tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NombrePais", "IdPais"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla2);

        jLabel5.setText("NombrePais");

        jLabel6.setText("IdPais");

        liTexto4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                liTexto4ActionPerformed(evt);
            }
        });

        liTexto5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                liTexto5ActionPerformed(evt);
            }
        });

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "NumeroID", "IdPais"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabla1);

        jButton4.setText("Agregar a Tabla Pais");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setText("Borrar Tabla Entera");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel8.setText("Borrar por NumeroID:");

        liTexto7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                liTexto7ActionPerformed(evt);
            }
        });

        jLabel9.setText("Borrar por IDPais:");

        liTexto8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                liTexto8ActionPerformed(evt);
            }
        });

        jButton8.setText("BORRAR");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("BORRAR");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel10.setText("Hacer UPDATE:");

        jLabel11.setText("NumeroID del alumno a cambiar");

        liTexto9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                liTexto9ActionPerformed(evt);
            }
        });

        jLabel12.setText("Nuevo Nombre");

        liTexto10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                liTexto10ActionPerformed(evt);
            }
        });

        jLabel13.setText("NuevoIDPais");

        liTexto11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                liTexto11ActionPerformed(evt);
            }
        });

        jLabel14.setText("Hacer UPDATE:");

        jLabel15.setText("IDPais para cambiar nombre");

        jLabel16.setText("Nuevo nombre del pais");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jToggleButton1.setText("UPDATE");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton2.setText("UPDATE");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(liTexto3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(liTexto1, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                        .addComponent(liTexto2)))
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addGap(219, 219, 219)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(52, 52, 52)
                        .addComponent(liTexto5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(liTexto4)))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4)
                    .addComponent(jButton6))
                .addGap(88, 88, 88))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(liTexto8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8))
                    .addComponent(jLabel10)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(liTexto10, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(liTexto9, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(liTexto11, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jToggleButton1))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(50, 50, 50)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(liTexto7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton9)
                            .addComponent(jToggleButton2)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(570, 570, 570))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(liTexto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(liTexto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(liTexto3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jLabel5)
                            .addComponent(liTexto4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(liTexto5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton6)
                                    .addComponent(jButton3))))))
                .addGap(40, 40, 40)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(liTexto8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(liTexto7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8)
                    .addComponent(jButton9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(liTexto9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(liTexto10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(liTexto11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton1))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void liTexto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_liTexto1ActionPerformed
        // TODO add your handling code 
    }//GEN-LAST:event_liTexto1ActionPerformed

    private void liTexto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_liTexto2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_liTexto2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       connect();
       createNewTable();
       
       IntroducirDatos app = new IntroducirDatos();
       //metemos lo que el usuario haya escrito en las lineas de texto en el metodo insertar
       app.insert(liTexto1.getText(),Integer.parseInt(liTexto2.getText()),Integer.parseInt(liTexto3.getText()));
       //Limpiamos los campos despues de hacer el insert
       liTexto1.setText("");
       liTexto2.setText("");
       liTexto3.setText("");
       //vaciamos tabla y luego la volvemos a cargar con los nuevos datos
       vaciarTabla();
       mostrarTablas();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
   // ESTABLECER LA CONEXIÓN
   Connection conexion;
   conexion = DriverManager.getConnection("jdbc:sqlite:D:\\Clase\\SQLMan\\hola.db");
   // CREAR ENUNCIADO
   Statement enunciado;
   enunciado = conexion.createStatement();
   // CONSULTA DATOS
   ResultSet resultados;
   resultados = enunciado.executeQuery("SELECT * FROM Clase;");
   // PROCESAR EL RESULTADO
   while (resultados.next()) {
    System.out.println("Nombre: " + resultados.getString(1)
      + " numeroID: " + resultados.getInt(2)+" IdPais: "+resultados.getString(3));
   }
   vaciarTabla();
   mostrarTablas();
   // CERRAR
   resultados.close();
   enunciado.close();
   conexion.close();

  } catch (Exception e) {
   JOptionPane.showMessageDialog(null,"No existe la base de datos, por favor cree un alumno antes");
  }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
          try {
   // ESTABLECER LA CONEXIÓN
   Connection conexion;
   conexion = DriverManager.getConnection("jdbc:sqlite:D:\\Clase\\SQLMan\\hola.db");
   // CREAR ENUNCIADO
   Statement enunciado;
   enunciado = conexion.createStatement();
   // BORRAR LA TABLA Y LO QUE HAY ESCRITO EN LA MISMA DE LA INTERFAZ
   enunciado.execute("DROP TABLE IF EXISTS clase;");
   
    // CERRAR
   enunciado.close();
   conexion.close();
  } catch (Exception e) {
   System.out.println(e.getMessage());
  }
    JOptionPane.showMessageDialog(null, "Base Borrada con exito!\nAhora no podrá acceder hasta que cree un nuevo alumno");
    //Lmpiamos los campos
    liTexto1.setText("");
    liTexto2.setText("");
    liTexto3.setText("");
    //vaciamos tabla y luego la volvemos a cargar con los nuevos datos
    vaciarTabla();
    mostrarTablas();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void liTexto3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_liTexto3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_liTexto3ActionPerformed

    private void liTexto4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_liTexto4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_liTexto4ActionPerformed

    private void liTexto5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_liTexto5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_liTexto5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       connect();
       createNewTable2();   
       IntroducirDatos app1l = new IntroducirDatos();
       app1l.insert2(liTexto4.getText(),Integer.parseInt(liTexto5.getText()));
       //limpiamos los campos
       liTexto4.setText("");
       liTexto5.setText("");
       //vaciamos tabla y luego la volvemos a cargar con los nuevos datos
       vaciarTabla();
       mostrarTablas();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
   // ESTABLECER LA CONEXIÓN
   Connection conexion;
   conexion = DriverManager.getConnection("jdbc:sqlite:D:\\Clase\\SQLMan\\hola.db");
   // CREAR ENUNCIADO
   Statement enunciado;
   enunciado = conexion.createStatement();
   // BORRAR LA TABLA Y LO QUE HAY ESCRITO EN LA MISMA DE LA INTERFAZ
   enunciado.execute("DROP TABLE IF EXISTS Pais;");
    //vaciamos tabla y luego la volvemos a cargar con los nuevos datos
   vaciarTabla();
   mostrarTablas();
    // CERRAR
   enunciado.close();
   conexion.close();
  } catch (Exception e) {
   System.out.println(e.getMessage());
  }
    JOptionPane.showMessageDialog(null, "Base Borrada con exito!\nAhora no podrá acceder hasta que cree un nuevo alumno");
    //Limpiamos los campos
    liTexto4.setText("");
    liTexto5.setText("");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void liTexto7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_liTexto7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_liTexto7ActionPerformed

    private void liTexto8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_liTexto8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_liTexto8ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
    //Instanciamos objeto de Borrar datos para usar su metodo de borrar
    BorrarDatos obj= new BorrarDatos();
    //REcibe el id del alumno por la interfaz
   obj.borrarAlumn(Integer.parseInt(liTexto8.getText()));
   //Limpiamos el campo
   liTexto8.setText("");
   tabla1.removeAll();
    //vaciamos tabla y luego la volvemos a cargar con los nuevos datos
   vaciarTabla();
   mostrarTablas();
   
 
//      try { 
//     Connection conexion;   
//    conexion = DriverManager.getConnection("jdbc:sqlite:D:\\Clase\\SQLMan\\hola.db");
//    Statement s;
//    s = conexion.createStatement();
//    ResultSet rs = s.executeQuery("select * from Clase");
//    ResultSetMetaData metaDatos = rs.getMetaData();
//            System.out.println(metaDatos);
//    
//        } catch (SQLException ex) {
//            Logger.getLogger(Tabla.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
   //Instanciamos objeto de Borrar datos para usar su metodo de borrar
    BorrarDatos obj= new BorrarDatos();
    //Recibe el id del pais por la interfaz
   obj.borrarPais(Integer.parseInt(liTexto7.getText()));
   //Limpiamos el campo
   liTexto7.setText("");
   tabla1.removeAll();
    //vaciamos tabla y luego la volvemos a cargar con los nuevos datos
   vaciarTabla();
   mostrarTablas();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void liTexto9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_liTexto9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_liTexto9ActionPerformed

    private void liTexto10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_liTexto10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_liTexto10ActionPerformed

    private void liTexto11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_liTexto11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_liTexto11ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
      Connection conexion;
        try {
            conexion = DriverManager.getConnection("jdbc:sqlite:D:\\Clase\\SQLMan\\hola.db");
   // CREAR ENUNCIADO
   Statement enunciado;
   enunciado = conexion.createStatement();
   //realizamos el update sql cogiendo los campos que hay en la interfaz
   enunciado.execute("UPDATE Clase set Nombre='"+liTexto10.getText()+"',IDPais='"+liTexto11.getText()+"' where NumeroID='"+liTexto9.getText()+"';");
   JOptionPane.showMessageDialog(null, "Se ha actualizado un alumno con exito!");
   //Limpiamos los campos
   liTexto10.setText("");
   liTexto11.setText("");
   liTexto9.setText("");
    //vaciamos tabla y luego la volvemos a cargar con los nuevos datos
   vaciarTabla();
   mostrarTablas();
    // CERRAR
   enunciado.close();
   conexion.close();
         } catch (SQLException ex) {
            Logger.getLogger(Tabla.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
         Connection conexion;
        try {
            conexion = DriverManager.getConnection("jdbc:sqlite:D:\\Clase\\SQLMan\\hola.db");
   // CREAR ENUNCIADO
   Statement enunciado;
   enunciado = conexion.createStatement();
   //realizamos el update sql cogiendo los campos que hay en la interfaz
   enunciado.execute("UPDATE Pais set NombrePais='"+jTextField3.getText()+"' where IDPais='"+jTextField2.getText()+"';");
   JOptionPane.showMessageDialog(null, "Se ha actualizado un pais con exito!");
   //Limpiamos los campos
   jTextField2.setText("");
   jTextField3.setText("");
    //vaciamos tabla y luego la volvemos a cargar con los nuevos datos
   vaciarTabla();
   mostrarTablas();
    // CERRAR
   enunciado.close();
   conexion.close();
         } catch (SQLException ex) {
            Logger.getLogger(Tabla.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JTextField liTexto1;
    private javax.swing.JTextField liTexto10;
    private javax.swing.JTextField liTexto11;
    private javax.swing.JTextField liTexto2;
    private javax.swing.JTextField liTexto3;
    private javax.swing.JTextField liTexto4;
    private javax.swing.JTextField liTexto5;
    private javax.swing.JTextField liTexto7;
    private javax.swing.JTextField liTexto8;
    private javax.swing.JTextField liTexto9;
    public static javax.swing.JTable tabla1;
    public static javax.swing.JTable tabla2;
    // End of variables declaration//GEN-END:variables
}
