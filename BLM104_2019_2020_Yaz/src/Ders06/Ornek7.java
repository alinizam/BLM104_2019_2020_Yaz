/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders06;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alinizam
 */
public class Ornek7 {

    public static void main(String[] args) {
        FileWriter f = null;
        try {
            f = new FileWriter("c:\\dosyalar\\Merhaba.txt");
        } catch (Exception e) {
            Logger.getLogger(Ornek7.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            if (f!=null) try {
                f.close();
            } catch (IOException ex) {
                Logger.getLogger(Ornek7.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
    }
}
