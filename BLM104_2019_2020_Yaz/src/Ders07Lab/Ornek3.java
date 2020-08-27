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
public class Ornek3 {
    public static void main(String[] args) throws IOException {
         String kaynakDosya="c:\\dosyalar\\Merhaba.txt";
         String hedefDosya="c:\\dosyalar\\SanadaMerhaba.txt";
         Path kaynakYol=Paths.get(kaynakDosya);
         Path hedefYol=Paths.get(hedefDosya);
         
         Files.copy(kaynakYol, hedefYol,REPLACE_EXISTING);
    }
}
