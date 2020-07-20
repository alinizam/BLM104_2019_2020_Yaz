/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders02.Ornek3;

import java.util.ArrayList;

/**
 *
 * @author alinizam
 */
public class Sirket {
    ArrayList<Personel> calisanlar=new ArrayList();
    int getToplamMaas(){
        int toplamMaas=0;
        for (Personel p : calisanlar) {
           toplamMaas=toplamMaas+ p.getMaas();
        }
        return toplamMaas;
    }
    int getToplamMesai(){
        int toplamMesai=0;
        for (Personel p : calisanlar) {
          if (p instanceof Isci) {
              toplamMesai=toplamMesai+ ((Isci)p).getMesai();
          }
        }
        return toplamMesai;
    }
}
