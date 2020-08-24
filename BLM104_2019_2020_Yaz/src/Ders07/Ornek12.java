/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders07;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author alinizam
 */
public class Ornek12 {

    public static void main(String[] args) throws FileNotFoundException {
        
        FileInputStream f=new FileInputStream("c:\\dosyalar\\sayilar.txt");
        BufferedInputStream bs=new BufferedInputStream(f);
        Scanner s = new Scanner(bs);
        
        //Scanner s = new Scanner(new BufferedInputStream(new FileInputStream("c:\\dosyalar\\sayilar.txt")));
        while (s.hasNextDouble()) {
            System.out.println(s.nextDouble());
        }
        s.close();
    }
}
