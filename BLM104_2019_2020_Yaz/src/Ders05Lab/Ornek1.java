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
public class Ornek1 {
    public static void main(String[] args) {
        String s="Fatih Sultan Mehmet Vakıf Üniversitesi";
        char[] karakterler=new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            karakterler[i]=s.charAt(i);
        }
        System.out.println(karakterler);
    }
}
