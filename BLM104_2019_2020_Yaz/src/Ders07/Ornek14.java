/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders07;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author alinizam
 */
public class Ornek14 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        DataOutputStream f=new DataOutputStream(new FileOutputStream("c:\\dosyalar\\veriler.dat"));
        f.writeInt(2000);
        f.writeInt(30000);
        f.close();
    }
}
