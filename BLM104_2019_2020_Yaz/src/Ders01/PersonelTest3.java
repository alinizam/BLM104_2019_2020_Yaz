/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders01;

/**
 *
 * @author alinizam
 */
public class PersonelTest3 {
    /*Unvanı memur olan personellere ödenen toplam maaşı bulunuz. Genişletimiş enhanced for*/
    public static void main(String[] args) {
        Personel[] personeller = new Personel[3];
        personeller[0] = new Personel();
        personeller[0].unvan = "MEMUR";
        personeller[0].maas = 50000;
        personeller[1] = new Personel();
        personeller[1].maas = 40000;
        personeller[1].unvan = "İŞÇİ";
        personeller[2] = new Personel();
        personeller[2].maas = 30000;
        personeller[2].unvan = "MEMUR";
        int toplamMaas = 0;
        for(Personel p:personeller){
            if (p.unvan=="MEMUR"){
                toplamMaas=toplamMaas+p.maas;
            }
        }
        System.out.println("Toplam memur maaşı = " + toplamMaas);
    }
}
