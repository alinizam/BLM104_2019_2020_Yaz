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
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

/**
 *
 * @author alinizam
 */
public class Ornek4 {
    public static void main(String[] args) throws IOException {
          String kaynakDosya="c:\\dosyalar\\Merhaba.txt";
         
          System.out.println(Files.exists(Paths.get(kaynakDosya)));
          System.out.println(Files.isReadable(Paths.get(kaynakDosya)));
    }
}
