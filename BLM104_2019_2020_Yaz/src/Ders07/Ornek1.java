/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders07;

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
public class Ornek1 {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            //Kayıt var mı kontrolü
            con.setAutoCommit(false);
            int maas=10000;
            int birim=1;
            String sqlPersonel = "INSERT INTO personel (personel_id,adi,soyadi,maas,birim_id) VALUES (?,?,?,?,?)";
            PreparedStatement psInsert = con.prepareStatement(sqlPersonel);
            psInsert.setInt(1, 29);
            psInsert.setString(2, "AYŞE");
            psInsert.setString(3, "SARI");
            psInsert.setInt(4, maas);
            psInsert.setInt(5, birim);
            psInsert.executeUpdate();
            
            String sqlBirim = "UPDATE birim SET toplam_odeme=toplam_odeme+?? WHERE birim_id=?";
            PreparedStatement psBirim = con.prepareStatement(sqlBirim);
            psBirim.setInt(1, maas);
            psBirim.setInt(2, birim);
            psBirim.executeUpdate();
            con.commit();
        } catch (SQLException ex) {
            Logger.getLogger(Ornek1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
