/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118071.latihan38.lingkaran;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA              : David Aditya Winarto
 * KELAS             : PBO2
 * NIM               : 10118071
 * Deskripsi Program : Program ini berisi program untuk menghitung
 *                     luas dan keliling lingkaran
 * 
 */
public class PBO210118071Latihan38Lingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        Lingkaran l = new Lingkaran();
        String dia;

        System.out.print("Masukkan nilai diameter lingkaran : ");
        dia = input.next();
        l.set_dia(dia);

        while (!(l.get_dia().matches("[0-9]*"))) {
            System.out.println("Nilai Diameter Tidak Sesuai\n");
            System.out.print("Masukkan nilai diameter lingkaran : ");
            dia = input.next();
            l.set_dia(dia);
        }

        l.set_d(Integer.parseInt(dia));
        l.set_jari((Integer.parseInt(dia)) / 2);

        System.out.println("\nJari-jari Lingkaran \t:" + l.get_jari());
        System.out.println("Luas Lingkaran \t\t:" + String.format("%.02f", l.luasLing()));
        System.out.println("Keliling Lingkaran \t:" + String.format("%.02f", l.kelilingLing()));
    }
    
}
