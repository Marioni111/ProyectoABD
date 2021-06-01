
package Conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class Conexion {
    
    static Connection contacto = null;
    public static String usuario;
    public static String password;
    public static boolean status = false;
    private static PreparedStatement pstm;
    private static ResultSet rs;
    
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
      
    public static boolean ABCC(String sql) {
        try {
            String consulta = sql;
            pstm = contacto.prepareStatement(consulta);
            pstm.executeUpdate();
            return true;
     } catch (Exception ex) {
            System.out.println(ex.toString());
     }
     return false;
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

    public static ResultSet Consulta2(String consulta){
                  try {
			
			pstm = contacto.prepareStatement(consulta);
			rs = pstm.executeQuery(consulta);		
			
		} catch (SQLException e) {
			System.out.println("No se pudo ejecutar instruccion");
			e.printStackTrace();
		}
		return rs;
    }
    
}