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
public class Ornek9 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        System.out.println("Kapasite:"+sb.capacity() +"  "+ "Uzunluk: " +sb.length());
        sb.append("FSMVÜ");
        System.out.println("Kap*asite:"+sb.capacity() +"  "+ "Uzunluk: " +sb.length());
        sb.append(" iyi bir üniversitedir.");
        System.out.println(sb);
        System.out.println("Kapasite:"+sb.capacity() +"  "+ "Uzunluk: " +sb.length());
        sb.setLength(9);
        System.out.println(sb);
        sb.insert(6, "güzel ve ");
        System.out.println(sb);
        
    }
}
