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
public class Test {
    public static void main(String[] args) {
        Personel p=new Personel();
        Personel.firma="FSMVÜ";
        System.out.println(p.firma);   
        Personel p1=new Personel();
        System.out.println(p1.firma);  
        
        p1.firma="Fatih Sultan Mehmet Vakıf Üniversitesi";
        
        System.out.println(p.firma);
        System.out.println(Personel.firma);
        
        p.yazFirma();
    }
}
