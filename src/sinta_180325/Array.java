/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sinta_180325;

/**
 *
 * @author user
 */
public class Array {
    public static void main(String[] args){
        boolean result[] = {true, false, true, false};
        double[] grades = {100, 90, 80, 75};
        String days[] = {"Senin","Selasa","Rabu","Kamis","Jumat","Sabtu","Minggu"};
        System.out.println("results ke->10 adalah " + result[0]);
        
        for(int i=0; i<days.length; i++){
            System.out.println(days[i]);
        }
    }
}
