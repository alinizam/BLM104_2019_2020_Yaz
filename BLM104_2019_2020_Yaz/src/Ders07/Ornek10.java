/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders07;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author alinizam
 */
public class Ornek10 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader f=new BufferedReader(new FileReader("c:\\dosyalar\\Merhaba.txt"));
        String satir;
        while ((satir = f.readLine()) !=null) {
            System.out.print(satir+"\n");
        }
        System.out.println("");
        f.close();
    }
}
