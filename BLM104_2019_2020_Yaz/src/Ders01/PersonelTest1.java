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
public class PersonelTest1 {

    /*Personelleri bir dizide saklayınız ve personellere ödenen toplama maaşı bulunuz.*/
    public static void main(String[] args) {
        Personel[] personeller = new Personel[3];
        personeller[0] = new Personel();

        /*Personel p = new Personel();
        p.maas=60000;*/
        personeller[0].maas = 50000;
        personeller[1] = new Personel();
        personeller[1].maas = 40000;

        personeller[2] = new Personel();
        personeller[2].maas = 30000;

        
        int toplamMaas = 0;
        for (int i = 0; i < 3; i++) {
            toplamMaas = toplamMaas + personeller[i].maas;
        }
        System.out.println("Toplam maaş = " + toplamMaas);

    }
}
