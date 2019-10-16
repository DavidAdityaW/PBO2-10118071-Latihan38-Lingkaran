/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118071.latihan38.lingkaran;

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
public class Lingkaran {
    private String diameter;
    private int d;
    private int jari;
    private double luas;
    private double keliling;
    
    public void set_dia(String diameter) {
        this.diameter = diameter;
    }
    public String get_dia() {
        return diameter;
    }
    public void set_d(int d) {
        this.d = d;
    }
    public void set_jari(int jari) {
        this.jari = jari;
    }
    public int get_jari() {
        return jari;
    }
    
    public double luasLing() {
        luas = 3.14159 * jari * jari;
        return luas;
    }
    public double kelilingLing() {
        keliling = 2 * 3.14159 * jari;
        return keliling;
    }
    
}
