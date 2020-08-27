/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders07Lab;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author alinizam
 */
public class Ornek1 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String dosya="c:\\dosyalar\\Merhaba.txt";
        FileReader f=new FileReader(dosya);
        System.out.println((char)f.read());
    }
}
