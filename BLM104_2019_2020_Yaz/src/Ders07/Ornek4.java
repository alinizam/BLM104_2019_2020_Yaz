/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders07;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alinizam
 */
public class Ornek4 {
    public static void main(String[] args) {
        FileOutputStream f=null;
        try {
            f=new FileOutputStream("c:\\dosyalar\\Merhaba.txt");
            f.write('S');
            f.write('e');
            f.write('l');
            f.write('a');
            f.write('m');
            
        } catch (IOException ex) {
            Logger.getLogger(Ornek4.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                f.close();
            } catch (IOException ex) {
                Logger.getLogger(Ornek4.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
