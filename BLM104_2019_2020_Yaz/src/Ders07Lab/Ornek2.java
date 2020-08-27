/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders07Lab;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author alinizam
 */
public class Ornek2 {
    public static void main(String[] args) throws IOException {
        String dosya="c:\\dosyalar\\Merhaba.txt";
        Path p=Paths.get(dosya);
        System.out.println(p.getRoot());
        System.out.println(p.getFileName());
        System.out.println(p.toRealPath());
    }
}
