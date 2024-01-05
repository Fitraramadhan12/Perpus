/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasi;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author Asus
 */
public class koneksi {
      private String url="jdbc:mysql://localhost:3306/koneksii";
    private String username_xampp = "root";
    private String password_xampp = "";
    private Connection con;
    
     public void koneksi (){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_koneksii", "root", "");
            JOptionPane.showMessageDialog(null,"Koneksi Sukses");
        } catch (Exception e) {
            System.out.print("Koneksi Gagal"+ e.getMessage());
        }
    }

    public Connection getCon() {
        return con;
    }
}
