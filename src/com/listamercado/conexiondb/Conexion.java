package com.listamercado.conexiondb;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author JONATHAN
 */
public class Conexion {
    
    public static Connection getConnection(){
        Connection cn= null;
        try{ 
            cn = DriverManager.getConnection("jdbc:mysql://localhost/productos_db","root","");
            //JOptionPane.showMessageDialog(null, "Conectado a la base de Datos");
            return cn;
        }catch(SQLException ex){
            
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Por favor Verifique su Conexión");
            return null;
        }
    }
}
