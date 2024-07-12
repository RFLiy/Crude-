package Koneksi_Database;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class DataBase {
    Connection DataBase;
    
    public static Connection DataBase() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection DataBase = DriverManager.getConnection("jdbc:mysql://localhost/db_mahasiswa", "root", "");
            
            return DataBase;
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
            
            return null;
        }
    }
}
