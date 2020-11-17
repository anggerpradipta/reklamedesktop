/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class koneksi {
     private Connection koneksiDatabase;
    
    public Connection getkoneksi(){
        if(koneksiDatabase == null){
            try {
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("Driver Ditemukan");
                try {
                    koneksiDatabase = DriverManager.getConnection("jdbc:mysql://localhost:3306/dispenda","root","");
                    System.out.println("Koneksi Database Ditemukan");
                } catch (SQLException ex) {
                    System.out.println("Koneksi Database Tidak Ditemukan : \nDengan Pesan :" + ex.toString());
                }       
            } catch (ClassNotFoundException ex) {
                System.out.print("Class Driver Database Tidak Ditemukan : \n Dengan pesan Error " + ex.toString());
            }
        }
       return koneksiDatabase;
    }
}
