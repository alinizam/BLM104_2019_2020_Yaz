/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders02;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author alinizam
 */
public class Ornek2 {
    public static void main(String[] args) {
        JFrame pencerem=new JFrame();
        pencerem.setVisible(true);
        pencerem.setSize(300, 400);
        
        JTextField txt1=new JTextField("Text 1");
        pencerem.add(txt1);
        
        
        JButton buton=new JButton("Buton 1");
        pencerem.add(buton);
        
        for (int i = 0; i < 10; i++) {
            JButton buton1=new JButton(i+"");
            pencerem.add(buton1);    
        }
        
        pencerem.setLayout(new FlowLayout());
        
        pencerem.pack();
        
    }
}
