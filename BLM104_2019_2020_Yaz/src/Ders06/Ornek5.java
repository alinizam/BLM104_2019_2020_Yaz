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
public class Ornek5 {
    public static void main(String[] args) {
        try {
            Object o=null;
            o.toString();
            int i;
            i=1/0; 
            int[] dizi=new int[3];
            dizi[3]=100;
            i=(Integer)o;
        }catch (ArithmeticException e){
            System.out.println("Sayıyı sıfıra bölemezsiniz.");
        }catch (NullPointerException e){
            System.out.println("Nesneyi hafızada oluşturmadınız.");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Sınır dışı işlem.");
        }catch (Exception e) {
            System.out.println("Bir hata oluştu"+e.toString());
        } 
    }
}
