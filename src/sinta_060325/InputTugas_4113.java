/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sinta_060325;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author user
 */
public class InputTugas_4113 {
    public static void main(String[] args){
         BufferedReader dataIn= 
            new BufferedReader(new InputStreamReader (System.in));
         int a = 0;
         int b = 0;
         int c = 0;
         
         try {
            System.out.println("number1 = ");
            a =Integer.parseInt(dataIn.readLine());
            System.out.println("number2 = ");
            b =Integer.parseInt(dataIn.readLine());
            System.out.println("number3 = ");
            c =Integer.parseInt(dataIn.readLine());
        }
         catch (IOException e){
            System.out.println(" Error in getting input ");
        }
         int max = (b>a)?(a>c)?b:c:a;
         System.out.println(a);
         System.out.println(b);
         System.out.println(c);
         System.out.println(max);
         
         }
    
}
