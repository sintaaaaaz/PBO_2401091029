/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sinta.dao;

/**
 *
 * @author user
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Koneksi {
    private final String url = "jdbc:mysql://localhost/pbo_2401091029";
    private final String username = "root";
    private final String password ="";
   
    public Connection getKoneksi() throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(url, username, password);
    }
    
    public static void main(String[] args) {
        try {
            Koneksi k = new Koneksi();
            JOptionPane.showMessageDialog(null, "Koneksi Ok");
            k.getKoneksi();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error :"
                           + ex.getMessage());
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
