/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders07Lab;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author alinizam
 */
public class Ornek5 {

    public static void main(String[] args) throws IOException {
        String kaynakDosya = "c:\\dosyalar\\MerhabaDiyelim.txt";
        Path p=Paths.get(kaynakDosya);
        if (Files.notExists(Paths.get(kaynakDosya))){
             Files.createFile(p);
        }
    }
}
