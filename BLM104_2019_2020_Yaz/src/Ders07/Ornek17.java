/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders07;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author alinizam
 */
public class Ornek17 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        ObjectOutputStream f=new ObjectOutputStream(new FileOutputStream("c:\\dosyalar\\personeller.obj"));
        f.writeObject(new Personel("Ahmet","Ak",20000));
        f.writeObject(new Personel("Mehmet","Yeşil",30000));
        f.close();
    }
}
