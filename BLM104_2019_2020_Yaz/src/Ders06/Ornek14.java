/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alinizam
 */
public class Ornek14 {
      public static void main(String[] args) {
         try {
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "APP", "APP");
            String sql="DELETE FROM ogretmen WHERE ogretmen_id=?";
            PreparedStatement s=con.prepareStatement(sql);
            s.setInt(1, 2);  
            s.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Ornek11.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
