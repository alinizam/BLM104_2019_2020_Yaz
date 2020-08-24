/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders07;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author alinizam
 */
public class Ornek16 {

    public static void main(String[] args) throws IOException {
        DataInputStream f = new DataInputStream(new FileInputStream("c:\\dosyalar\\veriler.dat"));
        try {
            while (true) {
                System.out.println(f.readInt());
            }

        } catch (EOFException e) {
            System.out.println("Dosya bitti.");
        }

    }
}
