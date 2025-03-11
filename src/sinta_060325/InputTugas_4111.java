/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sinta_060325;

/**
 *
 * @author user
 */
import java.io.*;
public class InputTugas_4111 {
    public static void main(String[] args){
        BufferedReader dataIn= 
            new BufferedReader(new InputStreamReader (System.in));
        int number =0;
        char letter ='a';
        String t = "";
        boolean result =true;
        String str ="";
        try {
            System.out.print("number = ");
            number = Integer.parseInt(dataIn.readLine());
            
            System.out.print("letter = ");
            t = dataIn.readLine();
            letter = t.charAt(0); 
            
            System.out.println("str = ");
            str = dataIn.readLine();
        }catch (IOException e){
            System.out.println(" Error in getting input ");
        }
        System.out.println(number);
        System.out.println(letter);
        System.out.println(result);
        System.out.println(str);
    }
    
    
    
}
