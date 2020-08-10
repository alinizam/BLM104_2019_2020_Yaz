/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders05;

/**
 *
 * @author alinizam
 */
public class Ornek2 {

    static class Personel {
        int maas;
    }

    public static void main(String[] args) {
        String adi = "Ahmet";
        adi = "Kemal";
        System.out.println(adi);
        
        adiDegistir(adi);
        System.out.println(adi);
        
        Personel p=new Personel();
        p.maas=1000;
        maasArttir(p, 500);
        System.out.println(p.maas);
        
    }

    static void maasArttir(Personel p, int miktar) {
        p.maas = p.maas + miktar;
    }
    
    static void adiDegistir(String adi){
        adi="Mehmet";
        System.out.println(adi);
    }
}
