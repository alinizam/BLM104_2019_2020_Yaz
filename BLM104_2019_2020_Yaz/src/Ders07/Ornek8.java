/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders07;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author alinizam
 */
public class Ornek8 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedOutputStream f=new BufferedOutputStream(new FileOutputStream("c:\\dosyalar\\Merhaba.txt"));
        f.write('S');
        f.write('e');
        f.write('l');
        f.write('a');
        f.write('M');
        f.close();
    }
}
