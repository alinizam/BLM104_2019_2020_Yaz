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
public class Ornek4 {
    public static void main(String[] args) {
        try {
            FileWriter f=new FileWriter("c:\\dosyalarff\\Merhaba.txt");
        } catch (IOException ex) {
            Logger.getLogger(Ornek4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
