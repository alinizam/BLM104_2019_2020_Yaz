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
public class Ornek9 {
    public static void main(String[] args) {
        try {
            dosyaOku();
        } catch (IOException ex) {
            Logger.getLogger(Ornek9.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void dosyaOku() throws IOException {
       FileWriter f = new FileWriter("c:\\dosyalar\\Merhaba.txt");
    }
}
