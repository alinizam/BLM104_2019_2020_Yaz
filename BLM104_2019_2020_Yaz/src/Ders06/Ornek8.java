/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders06;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author alinizam
 */
public class Ornek8 {

    public static void main(String[] args) {
        try (FileWriter f = new FileWriter("c:\\dosyalar\\Merhaba.txt")) {
        
        } catch (IOException e) {

        }
    }
}
