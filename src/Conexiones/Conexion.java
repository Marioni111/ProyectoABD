
package Conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Statement;

public class Conexion {
    
    static Connection contacto = null;
    public static String usuario;
    public static String password;
    public static boolean status = false;
    
    public static Connection getConnection(){
        
        status = false;
        String url = "jdbc:postgresql://localhost:5432/Employees";
        try {
        Class.forName("org.postgresql.Driver");
                    
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null,"No se puede establecer conexion... revisa drivers" + e.getMessage(),
                    "error de conexion",JOptionPane.ERROR_MESSAGE);
        }
    
        try {
            contacto = DriverManager.getConnection(url,Conexion.usuario,Conexion.password);
            status = true;
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null,"ERROR" + e.getMessage(),
                    "error de conexion",JOptionPane.ERROR_MESSAGE);
        }
    return contacto;
    }
    
    public static void setCuenta(String usuario, String password){
        Conexion.usuario = usuario;
        Conexion.password = password;
    }
    public static boolean getStatus(){
        return status;
    }
      
    public static ResultSet Consulta(String consulta){
    Connection con = getConnection();
    Statement declara;
        try {
            declara=con.createStatement();
            ResultSet respuesta = declara.executeQuery(consulta);
            return respuesta;
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null,"ERROR" + e.getMessage(),
                    "error de conexion",JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    
}