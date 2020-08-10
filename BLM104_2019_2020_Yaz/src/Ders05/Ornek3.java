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
public class Ornek3 {
    public static void main(String[] args) {
        String s="Fatih Sultan Mehmet Vakıf Mehmet Üniversitesi";
        System.out.println(s.charAt(3));
        s = s.concat(" Bilgisayar Müh Bölümü");
        System.out.println(s);
        
        System.out.println(s.substring(2,3));
        System.out.println(s.substring(2));
        
        System.out.println(s.toUpperCase());
        System.out.println(s.indexOf("Mehmet",17));
        System.out.println(s.lastIndexOf("Mehmet"));
        
        System.out.println(s.replace("i", "I"));
    }
}
