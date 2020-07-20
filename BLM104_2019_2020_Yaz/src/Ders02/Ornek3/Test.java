/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders02.Ornek3;

/**
 *
 * @author alinizam
 */
public class Test {
    public static void main(String[] args) {
        Memur m=new Memur();
        Sirket s=new Sirket();
        s.calisanlar.add(new Isci());
        s.calisanlar.add(new Isci());
        s.calisanlar.add(new Memur());
        s.calisanlar.add(new Personel());
        //s.calisanlar.add(new Sozlesmeli());
        System.out.println(s.getToplamMaas());
        
        Personel p=new Isci();
        System.out.println(p.getMaas());
        
    }
}
