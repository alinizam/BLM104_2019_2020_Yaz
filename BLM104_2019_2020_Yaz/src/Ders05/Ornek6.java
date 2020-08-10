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
public class Ornek6 {
    public static void main(String[] args) {
        String s1="Ahmet";
        String s2="Ahmet";
        System.out.println(s1==s2);
    
        String s3=new String("Ahmet");
        System.out.println(s1==s3);
        
        System.out.println(s1.equals(s3));
        System.out.println("Ahmet"==s1);
    }
}
