/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author alinizam
 */
public class Ornek10 {
    public static void main(String[] args) {
        String aranan="Fatih1 S1ultan2 Mehmet333 VAkıf Üniversitesi";
     // String desen="[A-Z0-9]";
        String desen="([A-Z][0-9])+";
        Pattern p= Pattern.compile(desen);
        Matcher m=p.matcher(aranan);
        while (m.find()){
            System.out.println(m.group()+"    "+m.start()+":"+m.end());
        }
        
    }
}
