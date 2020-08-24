/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders07;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author alinizam
 */
public class Ornek15 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        DataInputStream f=new DataInputStream(new FileInputStream("c:\\dosyalar\\veriler.dat"));
        System.out.println(f.readUTF());
        System.out.println(f.readInt());
        f.close();
    }
}
