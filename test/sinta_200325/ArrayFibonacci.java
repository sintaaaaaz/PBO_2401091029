/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sinta_200325;

/**
 *
 * @author user
 */
import java.util.Arrays;
public class ArrayFibonacci {
    public static int Fibonacci(int n){
        if(n <= 1){
            return n;
        }
        return Fibonacci(n-1)+Fibonacci(n-2);
    }
    
    public static int[] GetFibonacciArray(int[] arr){
        return Arrays.stream(arr)
                .map(ArrayFibonacci :: Fibonacci)
                .toArray();
    }
    
    public static void main(String[] args){
        int[] InputArray = {0,1,2,3,4,5,6,7,8,9};
        int[] ArrayFibonacci = 
                GetFibonacciArray(InputArray);
        System.out.println("Input Array = " + Arrays.toString(InputArray));
        System.out.println("Array Fibonacci = " + Arrays.toString(ArrayFibonacci));
    }
}
