/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders05Lab;

/**
 *
 * @author alinizam
 */
public class Ornek2 {
    public static void main1(String[] args) {
        String s="ahmet";
        StringBuilder kendisi=new StringBuilder(s);
        StringBuilder tersi=kendisi.reverse();
        System.out.println("Polindrome mu ? = " +kendisi.equals(tersi) );
    }
    public static void main(String[] args) {
        String kendisi="kabak";
        String tersi="";
        for (int i = kendisi.length()-1; i >=0; i--) {
            tersi+=kendisi.charAt(i);
        }
        System.out.println("Polindrome mu ? = " +kendisi.equals(tersi) );
    }
    
}
