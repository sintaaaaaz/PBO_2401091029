/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_sinta_130325;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Tugas654WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = scanner.nextInt();

        System.out.print("Masukkan nilai pangkat: ");
        int pangkat = scanner.nextInt();

        int hasil = 1;
        int i = 0;

        while (i < pangkat) {
            hasil *= angka;
            i++;
        }

        System.out.println(angka + " pangkat " + pangkat + " adalah " + hasil);

        scanner.close();
    }
}
