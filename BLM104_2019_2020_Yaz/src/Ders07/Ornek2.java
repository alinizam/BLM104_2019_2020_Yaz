/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders07;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author alinizam
 */
public class Ornek2 {
    public static void main(String[] args) {
        try(FileInputStream f=new FileInputStream("c:\\dosyalar\\Merhaba.txt")){
            System.out.print((char)f.read());
            System.out.print((char)f.read());
            System.out.print((char)f.read());
            System.out.print((char)f.read());
            System.out.print((char)f.read());
            System.out.print((char)f.read());
            System.out.print((char)f.read());
            System.out.println("");
        }catch(IOException e){
            System.out.println("Hata oldu" + e.toString());
        }
    }
}
