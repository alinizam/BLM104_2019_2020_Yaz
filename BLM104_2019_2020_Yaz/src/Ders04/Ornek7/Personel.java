/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders04.Ornek7;

/**
 *
 * @author alinizam
 */
public class Personel {

    String adi, soyadi;
    int maas;

    public Personel(String adi, String soyadi, int maas) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.maas = maas;
    }

    @Override
    public String toString() {
        return adi + " " + soyadi; //To change body of generated methods, choose Tools | Templates.
    }

}
