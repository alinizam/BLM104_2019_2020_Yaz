/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders02Lab;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author alinizam
 */
public class Ornek5 {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        f.setVisible(true);
       
        f.setLayout(new FlowLayout());
        f.add(new JLabel("Merhaba"));
        f.add(new JTextField("Dünya"));
        f.add(new JButton("Yazıldı"));
        f.setSize(300, 300); 
    }
}
