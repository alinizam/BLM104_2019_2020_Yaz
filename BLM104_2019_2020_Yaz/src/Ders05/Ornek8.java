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
public class Ornek8 {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder("");
        for (int i = 0; i < 100000; i++) {
           s.append("a");
        }
       // System.out.println(s);
        System.out.println("Bitti");
    }
}
