/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_sinta_040325;

/**
 *
 * @author user
 */
public class Tugas4113 {
    public static void main(String[] args){
      int a = 10;
      int b = 20;
      int c = 30;
        
        int nilaiTerbesar = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("Nilai terbesar dari 3 bilangan adalah: " + nilaiTerbesar);
    }
    
}
