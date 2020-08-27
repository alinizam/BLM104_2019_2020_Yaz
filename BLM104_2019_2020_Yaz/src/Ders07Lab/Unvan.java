/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders07Lab;

/**
 *
 * @author alinizam
 */
public class Unvan {
    int unvanId;
    String unvanAdi;

    public Unvan(int unvanId, String unvanAdi) {
        this.unvanId = unvanId;
        this.unvanAdi = unvanAdi;
    }

    @Override
    public String toString() {
        return unvanAdi;
    }
    
    
}
