/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sinta_200325;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class ArrayGanjil {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Masukkan sebuah bilangan = ");
            int number = scanner.nextInt();
            
            boolean isOddNumber = isOdd(number);
            
            System.out.println("Apakah bilangan " + number + " Adalah ganjil = " + isOddNumber);
            
            scanner.close();
    }
    public static boolean isOdd(int number){
        return number % 2 != 0;
    }
}
    

