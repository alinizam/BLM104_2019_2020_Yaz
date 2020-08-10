/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders05;

import java.text.DecimalFormat;

/**
 *
 * @author alinizam
 */
public class Ornek14 {
    public static void main(String[] args) {
        String desen="##,##.000";
        DecimalFormat bicimlendirici=new DecimalFormat(desen);
        double sayi=105605.12;
        String s=bicimlendirici.format(sayi);
        System.out.println(s);

    }
            
}
