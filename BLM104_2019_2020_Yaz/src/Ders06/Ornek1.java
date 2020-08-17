/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders06;

import java.util.Scanner;

/**
 *
 * @author alinizam
 */
public class Ornek1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int i=s.nextInt();
        System.out.println("Bir bölen giriniz");
        int j=s.nextInt();
        System.out.println("Bölüm = " +i/j);
        
    }
}
