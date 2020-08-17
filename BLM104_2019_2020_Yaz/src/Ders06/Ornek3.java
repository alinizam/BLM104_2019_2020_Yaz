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
public class Ornek3 {

    public static void main(String[] args) {
        System.out.println("Main başladı");
        a();
        System.out.println("Main başarılı bir şekilde bitti.");
    }

    private static void a() {
        System.out.println("a başladı");
        b();
        System.out.println("a başarılı bir şekilde bitti.");
    }

    private static void b() {
        System.out.println("b başladı");
        try {
            hataUretenMetot();
            System.out.println("b başarılı bir şekilde bitti.");
        } catch (Exception e) {
            System.out.println("Hata çözüldü");
        }
    }

    private static void hataUretenMetot() {

        int i = 1 / 0;

    }

}
