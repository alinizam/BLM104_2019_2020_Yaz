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
public class Ornek10 {

    public static void main(String[] args) {
        try {
            int i;
            i = 0;
            if (i <= 0) {
                throw new ArithmeticException("Girdiğiniz parametre yanlış");
            }
       
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }
}
