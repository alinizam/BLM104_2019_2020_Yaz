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
public class Personel {
    String adi, soyadi;
    Personel(){
    
    }
    public Personel(String adi, String soyadi) {
        this.adi = adi;
        this.soyadi = soyadi;
    }

    public String getAdi() {
        return this.adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }
   
    void isimYaz(){
        System.out.println(adi+" "+soyadi);
    }
    void isimYaz(String adi){
        this.adi=adi;
        System.out.println(adi+" "+soyadi);
    }
}
