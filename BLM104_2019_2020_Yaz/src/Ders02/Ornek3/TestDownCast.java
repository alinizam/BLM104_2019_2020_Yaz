/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders02.Ornek3;

/**
 *
 * @author alinizam
 */
public class TestDownCast {
    public static void main(String[] args) {
        Sirket s=new Sirket();
        s.calisanlar.add(new Isci());
        s.calisanlar.add(new Isci());
        s.calisanlar.add(new Memur());
        System.out.println(s.getToplamMesai());
                
    }
}
