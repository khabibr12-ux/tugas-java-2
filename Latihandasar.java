/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihandasar;

/**
 *
 * @author ASUS
 */
public class Latihandasar {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {

        int a = 20;
        int b = 5;

        System.out.println("===== OPERASI ARITMATIKA =====");

        System.out.println("Nilai A = " + a);
        System.out.println("Nilai B = " + b);

        System.out.println("Penjumlahan = " + penjumlahan(a, b));
        System.out.println("Pengurangan = " + pengurangan(a, b));
        System.out.println("Perkalian   = " + perkalian(a, b));
        System.out.println("Pembagian   = " + pembagian(a, b));
        System.out.println();
        biodata();
    }

    public static int penjumlahan(int a, int b) {
        return a + b;
    }

    public static int pengurangan(int a, int b) {
        return a - b;
    }

    public static int perkalian(int a, int b) {
        return a * b;
    }

    public static int pembagian(int a, int b) {
        return a / b;
    }

    public static void biodata() {

        System.out.println("===== BIODATA =====");
        System.out.println("Nama     : AHMAD KHABIBURIDHO");
        System.out.println("NIM      : 251101036");
        System.out.println("Kelas    : C");
        System.out.println("Prodi    : Teknik Informatika");
        System.out.println("Kampus   : Universitas Nahdlatul Ulama Sunan Giri");
        System.out.println("Semester : 03");
    }
}
       