/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders03.Ornek2;

/**
 *
 * @author alinizam
 */
public class PersonelYapiciTest {
    public static void main(String[] args) {
        Personel p=new Personel("Ahmet", "Ak");
        p.isimYaz();
        Memur m=new Memur();
        Memur m1=new Memur("Ahmet AK");
        Memur m2=new Memur();
        
    }
}
