/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders02Lab.Ornek4;

/**
 *
 * @author alinizam
 */
public class Personel {
    String adi,soyadi;
    static String firma;
    void yazFirma(){
        System.out.println(firma);
    }
    static void yazFirmaStatik(){
        System.out.println(firma);
    }
    static void yazIsim(){
       // System.out.println(adi+" "+soyadi);
    }
    public static void main(String[] args) {
       // System.out.println(adi);
    }
}
