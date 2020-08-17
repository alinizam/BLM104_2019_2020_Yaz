/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders06;

/**
 *
 * @author alinizam
 */
public class Ornek6 {
    public static void main(String[] args) {
        try {
            int i=1/1;
            return;
        } catch (Exception e) {
            System.out.println("Bir hata oluştu");    
        }finally{
            System.out.println("Program bitti");    
        } 
    }
}
