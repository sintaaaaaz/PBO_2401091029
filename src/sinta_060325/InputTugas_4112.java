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
public class InputTugas_4112 {
    public static void main(String[] args){
        BufferedReader dataIn= 
            new BufferedReader(new InputStreamReader (System.in));
        int number1 = 0;
        int number2 = 0;
        int number3 = 0;
        try {
            System.out.print("number1 = ");
            number1 = Integer.parseInt(dataIn.readLine());
            
            System.out.print("number2 = ");
            number2 = Integer.parseInt(dataIn.readLine());
            
            System.out.print("number3 = ");
            number3 = Integer.parseInt(dataIn.readLine());
        }catch (IOException e){
            System.out.println(" Error in getting input ");
        }
       double average = (number1 + number2 + number3)/3;
       System.out.println(number1);
       System.out.println(number2);
       System.out.println(number3);
       System.out.println(average);
    }
    
}
