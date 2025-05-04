/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sinta_180325;

/**
 *
 * @author user
 */
public class Latihan771 {
    public static void main(String[] args){
        String days[] ={"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        
         int i=0;
         System.out.println("menggunakan while-loop");
         while(i<days.length){
             System.out.println(days[i]);
             i++;
         }
         
         System.out.println("menggunakan do while-loop");
         i = 0;
         do{
            System.out.println(days[i]);
            i++;
         }while(i<days.length);
         
         System.out.println("menggunakan for-loop");
         for(i=0; i<days.length; i++){
             System.out.println(days[i]);
         }
         
         
         
    }
    
}
