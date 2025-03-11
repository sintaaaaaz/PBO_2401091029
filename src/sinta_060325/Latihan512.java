/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sinta_060325;

/**
 *
 * @author user
 */
import javax.swing.JOptionPane;
public class Latihan512 {
    public static void main(String[] args){
        String word1 ="";
        String word2 ="";
        word1 = JOptionPane.showInputDialog(" Please enter your word1 ");
        word2 = JOptionPane.showInputDialog(" Please enter your word2 ");
        String msg =( word1+ " " +word2 + " Hello " + " ! ");
        JOptionPane.showMessageDialog(null, msg);
    }
    
}
