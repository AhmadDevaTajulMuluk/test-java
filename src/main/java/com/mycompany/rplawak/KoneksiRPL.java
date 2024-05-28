/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rplawak;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author HP
 */

public class KoneksiRPL {
    
    public static Connection koneksi;
    
    public static Connection konfigurasi_database() throws SQLException{

        try {
            String host_url = "jdbc:mysql://localhost/db_rplawak";
            String user = "root";
            String pass = "";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            koneksi = DriverManager.getConnection(host_url, user, pass);
//            System.out.println("Koneksi berhasil");
//            JOptionPane.showMessageDialog(null, "Selamat koneksi berhasil");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi gagal! \n"+e);
        }
        
        return koneksi;
    }
    
    public static void main(String[] args) throws SQLException {

        Connection penghubung  = (Connection)KoneksiRPL.konfigurasi_database();
        
    }
}

