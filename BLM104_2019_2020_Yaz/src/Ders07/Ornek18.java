/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author alinizam
 */
public class Ornek18 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream f=new ObjectInputStream(new FileInputStream("c:\\dosyalar\\personeller.obj"));
        Personel p=(Personel)(f.readObject());
        System.out.println(p.adi+" "+p.soyadi+" "+p.maas);
        p=(Personel)(f.readObject());
        System.out.println(p.adi+" "+p.soyadi+" "+p.maas);
        f.close();
    }
}
