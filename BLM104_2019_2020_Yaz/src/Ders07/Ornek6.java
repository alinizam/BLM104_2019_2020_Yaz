/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders07;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author alinizam
 */
public class Ornek6 {
    public static void main(String[] args) throws IOException {
        FileWriter f=new FileWriter("c:\\dosyalar\\Merhaba.txt");
        f.write("Merhaba Ahmet AK");
        f.close();
    }
}
